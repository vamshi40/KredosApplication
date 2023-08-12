package com.pages;

public class a {

    public static void main(String args[]) {

        String Resources ="macros/READ,mc/READ,add-macros/READ,experiment-canvas/READ,Kredos resource -1/READ,experiments/READ,launch/READ,add-experiments/READ,macro-canvas/READ,uploadFile/READ,search/READ,message-mechanics/READ,Kredos resource -3/READ,all-images/READ,Kredos resource -2/READ,get-allTemplates/READ,Download/READ,get-reports/READ";

        if (Resources.length() > 0) {


            String[] Resource = Resources.split(",");
            for (int i = 0; i < Resource.length; i++) {


                System.out.println("" + Resource[i]);


                String[] res = Resource[i].split("/");

                System.out.println(""+res[0]);
                System.out.println(""+res[1]);
            }

        }
    }
}

