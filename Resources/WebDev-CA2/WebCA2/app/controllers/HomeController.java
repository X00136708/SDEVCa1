package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.*;
import javax.inject.Inject;

import models.*;
import models.users.*;
import views.html.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }
    public Result events(Long cat) {
        List<Events> eventList = null;
        List<Category> categoryList = Category.findAll();
        if (cat == 0){
            eventList = Events.findAll();
        } else {
            eventList = Category.find.ref(cat).getEvents();
        }
        return ok(events.render(eventList, categoryList, User.getUserById(session().get("email"))));
    }
    public Result venues() {
        List<Venues> venueList = Venues.findAll();
        return ok(venues.render(venueList, User.getUserById(session().get("email"))));
    }
    public Result form() {
        return ok(views.html.form.render(User.getUserById(session().get("email"))));
    }
    public Result profile() {
        return ok(views.html.profile.render(User.getUserById(session().get("email"))));
    }
    public Result aboutus() {
        return ok(views.html.aboutus.render(User.getUserById(session().get("email"))));
    }
    

    private FormFactory formFactory;
    
        @Inject
        public HomeController(FormFactory f){
            this.formFactory = f;
        }
        
        @Security.Authenticated(Secured.class)
            @With(AuthAdmin.class)
        public Result addEvent(){
            Form<Events> eventForm = formFactory.form(Events.class);
            return ok(addEvent.render(eventForm, User.getUserById(session().get("email"))));
        }

        @Security.Authenticated(Secured.class)
            @With(AuthAdmin.class)
        public Result addEventSubmit(){
    
            Form<Events> newEventForm = formFactory.form(Events.class).bindFromRequest();
    
            if (newEventForm.hasErrors()) {
                return badRequest(addEvent.render(newEventForm, User.getUserById(session().get("email"))));
            } else {
                Events newEvent = newEventForm.get();
                if (newEvent.getId() == null){
                    newEvent.save();
                } else if (newEvent.getId() != null) {
                    newEvent.update();
                }
                flash("success", "Event "+ newEvent.getName() + " was added");
                return redirect(controllers.routes.HomeController.events(0));
            }
        }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result deleteEvent(Long id){
        Events.find.ref(id).delete();
        flash("success", "Event has been deleted");
        return redirect(routes.HomeController.events(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEvent(Long id){
        Events e;
        Form<Events> eventForm;

        try {
            e = Events.find.byId(id);
            eventForm = formFactory.form(Events.class).fill(e);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEvent.render(eventForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addVenue(){
        Form<Venues> venueForm = formFactory.form(Venues.class);
        return ok(addVenue.render(venueForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addVenueSubmit(){
        
                Form<Venues> newVenueForm = formFactory.form(Venues.class).bindFromRequest();
        
                if (newVenueForm.hasErrors()) {
                    return badRequest(addVenue.render(newVenueForm, User.getUserById(session().get("email"))));
                } else {
                    Venues newVenue = newVenueForm.get();
                    if (newVenue.getId() == null){
                        newVenue.save();
                    } else if (newVenue.getId() != null) {
                        newVenue.update();
                    }
                    flash("success", "Venue "+ newVenue.getName() + " was added");
                    return redirect(controllers.routes.HomeController.venues());
                }
            }

            @Security.Authenticated(Secured.class)
            @With(AuthAdmin.class)
            public Result deleteVenue(Long id){
                Venues.find.ref(id).delete();
                flash("success", "Venue has been deleted");
                return redirect(routes.HomeController.venues());
            }


            @Security.Authenticated(Secured.class)
            @With(AuthAdmin.class)
            @Transactional
            public Result updateVenue(Long id){
                Venues  v;
                Form<Venues> venueForm;

                try {
                    v = Venues.find.byId(id);
                    venueForm = formFactory.form(Venues.class).fill(v);
                } catch (Exception ex) {
                    return badRequest("error");
                }
                return ok(addVenue.render(venueForm, User.getUserById(session().get("email"))));
            }
}
