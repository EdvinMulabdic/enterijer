package model;

import com.avaje.ebean.Model;
import com.cloudinary.Cloudinary;

/**
 * Created by User on 2/24/2016.
 */
public class Image extends Model {

    public static Cloudinary cloudinary;




//    public static List<String> tapete() {
//        List<String> results = new ArrayList<>();
//
//        String location = "E:/enterijer/public/images/tapeta";
//
//        File[] files = new File(location).listFiles();
//
//        if (files != null) {
//            for (File file : files) {
//                if (file.isFile()) {
//                    results.add("/assets/images/tapeta" + "/" + file.getName());
//                }
//            }
//        }
//        return results;
//    }


}
