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

public class LoginController extends Controller {
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result login(){
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(userLogin.render(loginForm, User.getUserById(session().get("email"))));
    }

    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(userLogin.render(loginForm, User.getUserById(session().get("email"))));
        } else {
            session().clear();
            session("email", loginForm.get().getEmail());
        }
        return redirect(controllers.routes.HomeController.index());
    }

    public Result logout() {
        session().clear();
        flash("success","you've been logged out");
        return redirect(routes.LoginController.login());
    }
}