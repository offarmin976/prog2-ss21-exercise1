import java.util.Currency;

public class checkPasswordClass {

    public static boolean checkPassword(String Query) {
        boolean checkPasswordBoolArray[] = {false, false, false, false, false, true, false};

        int countercharacter = Query.length();
        char currentvalue = ' ';
        char currentvlaue_plusone = ' ';
        boolean bool_value = false;

        if (countercharacter <= 25 && countercharacter >= 8) {
            checkPasswordBoolArray[0] = true;
        }
        for (int i = 0; i < Query.length(); i++) {

            currentvalue = Query.charAt(i);

            for (int j = 0; j < Query.length(); j++) {
                if(Character.isUpperCase(Query.charAt(j)) == true)
                {
                    checkPasswordBoolArray[1] = true;
                    break;
                }
            }
            for (int z = 0; z < Query.length(); z++) {
                if(Character.isLowerCase(Query.charAt(z)) == true)
                {
                    checkPasswordBoolArray[2] = true;
                    break;
                }
            }
            for(int q = 0; q < Query.length(); q++) {
                if (Character.isDigit(Query.charAt(q)) == true) {
                    checkPasswordBoolArray[3] = true;
                    /*
                    System.out.printf("" + Query.charAt(i));

                    int count_inter = Query.charAt(i);
                    Boolean aa = (Query.charAt(i) == count_inter);
                    Boolean bb = (Query.charAt(i + 1) == count_inter + 1);
                    Boolean cc = (Query.charAt(i + 2) == count_inter + 2);

                    if ((aa == true) && (bb == true) && (cc == true))
                    {
                        checkPasswordBoolArray[5] = false;
                    }
                    break;

                     */
                }

            }



            if ((currentvalue == '(') || (currentvalue == ')') || (currentvalue == '#') || (currentvalue == '$') || (currentvalue == '?') || (currentvalue == '!') || (currentvalue == '%') || (currentvalue == '/') || (currentvalue == '@')) {
                checkPasswordBoolArray[4] = true;
            }


            checkPasswordBoolArray[6] = true;
        }

        int counter_boolean = 0;
        for (int i = 0; i < 7; i++) {

            if (checkPasswordBoolArray[i] == true)
            {
                counter_boolean++;
            }


        }

        if (counter_boolean == 7) {
            bool_value = true;
        }
        return  bool_value;
    }



}
