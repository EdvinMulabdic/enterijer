package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result gallery() {

        return ok(gallery.render());
    }

    public Result contact() {
        return ok(contact.render());
    }

    public Result opliveral() {
        return ok(views.html.plmaterijali.oplemenjeniiveral.render());
    }


    public Result radneploce() {

        return ok(views.html.plmaterijali.radneploce.render());
    }

    public Result mdffarbani() {
        return ok(views.html.plmaterijali.mdffarbani.render());
    }

    public Result mdf() {
        return ok(views.html.plmaterijali.mdf.render());
    }

    public Result hdflesonit() {
        return ok(views.html.plmaterijali.hdflesonit.render());
    }

    public Result furniraneploce() {
        return ok(views.html.plmaterijali.furniraneploce.render());
    }

    public Result kerok() {
        return ok(views.html.plmaterijali.kerok.render());
    }

    public Result kuhinje() {
        return ok(views.html.nampomjeri.kuhinje.render());
    }

    public Result plakari() {

        return ok(views.html.nampomjeri.plakari.render());
    }

    public Result kannamjestaj() {
        return ok(views.html.nampomjeri.kannamjestaj.render());
    }

    public Result dnevnesobe() {
        return ok(views.html.nampomjeri.dnevnesobe.render());
    }

    public Result djecijesobe() {
        return ok(views.html.nampomjeri.djecijesobe.render());
    }

    public Result spavacesobe() {
        return ok(views.html.nampomjeri.spavacesobe.render());
    }

    public Result predsoblja() {
        return ok(views.html.nampomjeri.predsoblja.render());
    }

    public Result kupatila() {
        return ok(views.html.nampomjeri.kupatila.render());
    }

    public Result okov() {
        return ok(okov.render());
    }

    public Result onama() {
        return ok(onama.render());
    }

    public Result rigips(){
        return ok(views.html.dekoracijeEnterijera.rigips.render());
    }
    public Result tapete(){
        return ok(views.html.dekoracijeEnterijera.tapete.render());
    }
    public Result podneobloge(){
        return ok(views.html.dekoracijeEnterijera.podneobloge.render());
    }
    public Result rasvjeta(){
        return ok(views.html.dekoracijeEnterijera.rasvjeta.render());
    }
    public Result dekorativnizid(){
        return ok(views.html.dekoracijeEnterijera.dekorativnizid.render());
    }
    public Result dekorativnikamen(){
        return ok(views.html.dekoracijeEnterijera.dekorativnikamen.render());
    }
}
