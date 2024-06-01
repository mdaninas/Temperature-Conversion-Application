/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tessuhu;


public class Suhu {
float input;
float hasil;
String asal;
String  konver;


public float getSuhu() {
    switch (asal) {
        case "celcius":
            switch (konver) {
                case "celcius":
                    return input;
                case "fahrenheit":
                    return (float) (1.8 * input + 32);
                case "reamur":
                    return (float) (0.8 * input);
                default:
                    break;
            }
            break;
        case "fahrenheit":
            switch (konver) {
                case "celcius":
                    return (float) (0.55 * (input - 32));
                case "fahrenheit":
                    return input;
                case "reamur":
                    return (float) (0.44 * (input - 32));
                default:
                    break;
            }
            break;
        case "reamur":
            switch (konver) {
                case "celcius":
                    return (float) (1.25 * input);
                case "fahrenheit":
                    return (float) (2.25 * input + 32);
                case "reamur":
                    return input;
                default:
                    break;
            }
            break;
        default:
            break;
    }
    return 0;
}

   
}

