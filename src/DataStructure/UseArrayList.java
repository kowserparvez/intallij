package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    // array list use consecutive memory block ..
    public static void main(String[] args) {
        //declearing arrayList
        List<Integer> numbers = new ArrayList<Integer>();
        //storing data into arrayList
        numbers.add(90);
        numbers.add(80);

        //retrieving data from arrayList
        for(int i =0;i<numbers.size();i++) {
            System.out.println(numbers.get(i));

        }
        //retrieving data from arrayList for each loop
        // for each loop uses Iterator
        for (Integer num : numbers){
            System.out.println(num);
        }
        // Example of Data type or element type can be stored in arraylist
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setId(111);
        st1.setName("Taheem");
        st1.setDob("04-17-2012");
        st1.setName_class("Freshman");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(st1);
        studentList.add(st2);
        System.out.println( studentList.get(0).getId()+ " "+ studentList.get(0).getName()+" "+ studentList.get(0).getDob()+" "+ studentList.get(0).getName_class());

    }

}
