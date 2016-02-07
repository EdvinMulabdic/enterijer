package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.contact;
import views.html.gallery;
import views.html.index;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }
    public Result gallery(){

        return ok(gallery.render());
    }
    public Result contact(){
        return ok(contact.render());
    }
    public Result opliveral(){
        return ok(views.html.plmaterijali.oplemenjeniiveral.render());
    }


    public Result radneploce(){

        return ok(views.html.plmaterijali.radneploce.render());
    }
    public Result mdffarbani(){
        return ok(views.html.plmaterijali.mdffarbani.render());
    }
    public Result mdf(){
        return ok(views.html.plmaterijali.mdf.render());
    }
    public Result hdflesonit(){
        return ok(views.html.plmaterijali.hdflesonit.render());
    }
    public Result furniraneploce(){
        return ok(views.html.plmaterijali.furniraneploce.render());
    }
    public Result ivericasirova(){
        return ok(views.html.plmaterijali.ivericasirova.render());
    }
    public Result kuhinje(){
        return ok(views.html.nampomjeri.kuhinje.render());
    }
    public Result plakari(){
        return ok(views.html.nampomjeri.plakari.render());
    }
    public Result kannamjestaj(){
        return ok(views.html.nampomjeri.kannamjestaj.render());
    }
    public Result dnevnesobe(){
        return ok(views.html.nampomjeri.dnevnesobe.render());
    }
    public Result djecijesobe(){
        return ok(views.html.nampomjeri.djecijesobe.render());
    }
    public Result spavacesobe(){
        return ok(views.html.nampomjeri.spavacesobe.render());
    }
    public Result predsoblja(){
        return ok(views.html.nampomjeri.predsoblja.render());
    }
    public Result kupatila(){
        return ok(views.html.nampomjeri.kupatila.render());
    }

}
