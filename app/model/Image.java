package model;

import com.avaje.ebean.Model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2/24/2016.
 */
public class Image extends Model {

    public static List<String> amplakari() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/amplakari";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/amplakari" + "/" + file.getName());
                }
            }
        }
        return results;
    }
    public static List<String> kuhinje() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/kuhinje";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/kuhinje" + "/" + file.getName());
                }
            }
        }
        return results;
    }

    public static List<String> dnevnesobe() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/dnevnesobe";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/dnevnesobe" + "/" + file.getName());
                }
            }
        }
        return results;
    }

    public static List<String> kupaonickinamjestaj() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/kupaonickinamjestaj";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/kupaonickinamjestaj" + "/" + file.getName());
                }
            }
        }
        return results;
    }
    public static List<String> predsoblje() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/predsoblje";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/predsoblje" + "/" + file.getName());
                }
            }
        }
        return results;
    }

    public static List<String> tapete() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/tapeta";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/tapeta" + "/" + file.getName());
                }
            }
        }
        return results;
    }

    public static List<String> djecijesobe() {
        List<String> results = new ArrayList<>();

        String location = "E:/enterijer/public/images/djecijesobe";

        File[] files = new File(location).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    results.add("/assets/images/djecijesobe" + "/" + file.getName());
                }
            }
        }
        return results;
    }
}
