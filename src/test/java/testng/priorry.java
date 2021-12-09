package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class priorry {

    @Test(priority = 1,enabled = false)
    public void  a(){
        System.out.println("a");
    }
    @Test(priority = 2,enabled = false)
    public void  c(){
        System.out.println("c");
    }
    @Test(priority = 3,enabled = false)
    public void  b(){
        System.out.println("b");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Sistemm başlıyor.........");
    }

    @Test(priority = 1,enabled = false)
    public void test1(){
        Random random=new Random();
        int a= random.nextInt(10);
        int b=random.nextInt(10);

        int c=a+b;
        System.out.println("c:" +c);
        Assert.assertTrue(c<10);


    }

    @Test
    public void test2(){
        String a="qwer"; //expected
        String b="qwer"; //actual

        Assert.assertEquals(b,a); //a'yı öğrenmek istiyorum
        // sistemin ne vereceği, ikici kısım benim nasıl bir cevap beklediğim
    }

    @AfterClass
    public void afte2r(){
        System.out.println("Sistem kapıyorrr..........");
    }
}
