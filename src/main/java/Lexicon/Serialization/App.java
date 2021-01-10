package Lexicon.Serialization;

import Objects.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
      List <Car> cars = Arrays.asList(new Car("UCM 731","Mazda","2003 COMBI 2.0"),new Car("KTH 356","OPEL","2010 COMBI"));

        try {
            serializeToDisk(cars,"cars.txt");
            deserializeFromDisk("cars.txt");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void serializeToDisk(List<Car> cars, String filename) throws IOException{
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cars);
        fos.close();
        oos.close();
}

   private static void deserializeFromDisk(String filename) throws  IOException, ClassNotFoundException{
       List<Car> deserializedcar = new ArrayList<>();
       FileInputStream filein = new FileInputStream(filename);
       ObjectInputStream in = new ObjectInputStream(filein);
       deserializedcar = (List<Car>) in.readObject();
       for (int i = 0; i< deserializedcar.size();i++){
           System.out.println(deserializedcar.get(i).getCarId());
           System.out.println(deserializedcar.get(i).getRegnumber());
           System.out.println(deserializedcar.get(i).getBrand());
           System.out.println(deserializedcar.get(i).getModel());
           System.out.println(deserializedcar.get(i).getRegDate());
       }



}


}
