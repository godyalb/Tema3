/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoempleado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class UsoEmpleado {

    public static void main(String[] args) 
    {
        Persona antonio = new Persona("Antonio");
        System.out.println(antonio.getNombre());

        Empleado ana = new Empleado("Ana",35000);
        System.out.println(ana.getNombre());
        System.out.println(ana.getSalario());
        System.out.println(antonio.getClass());
         /*Class cl1 =antonio.getClass();
         System.out.println(cl1.getName());*/
        String nombreClase = "usoempleado.Persona";
        
        Scanner teclado = new Scanner(System.in);
        
        Class cl1;
        try 
        {
            cl1=Class.forName(nombreClase);                        
            System.out.println(cl1.getName());
            
            // ----------------------------------------------------------
            Constructor constructor[];
            constructor = cl1.getDeclaredConstructors();
            
            for(int i=0; i<constructor.length; i++)
            {
                System.out.println("Constructores: " + constructor[i].toString());
            }
            
            // -----------------------------------------------------------
            Method method[];
            method = cl1.getDeclaredMethods();
            
            for(int i=0; i<constructor.length; i++)
            {
                System.out.println("Metodo: " + method[i].toString());
            }
            
            // ------------------------------------------------------------
            int modifier;
            modifier = cl1.getModifiers();
            System.out.println("Modificadores: " + modifier);
            
            // ------------------------------------------------------------
            Field field[];
            field = cl1.getDeclaredFields();
            
            for(int i=0; i<field.length; i++)
            {
                System.out.println("Fields: " + field[i].toString());
            }
            
            String dameClase;
            // Pide al usuario el nombre de la clase
            System.out.println("Dame el nombre de la clase");
            dameClase = teclado.nextLine();
            
            cl1=Class.forName(dameClase);                        
            System.out.println(cl1.getName());
            

        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(UsoEmpleado.class.getName()).log(Level.SEVERE,
            null, ex);
        }
        nombreClase = "usoempleado.Empleado";
        try 
        {
            cl1=Class.forName(nombreClase);
            System.out.println(cl1.getName());
            
            // ------------------------------------------------------------
            
            Constructor constructor[];
            constructor = cl1.getDeclaredConstructors();
            
            for(int i=0; i<constructor.length; i++)
            {
                System.out.println("Constructores: " + constructor[i].toString());
            }
            
            //----------------------------------------------------------------
            Method method[];
            method = cl1.getDeclaredMethods();
            
            for(int i=0; i<constructor.length; i++)
            {
                System.out.println("Metodo: " + method[i].toString());
            }
            
            //-----------------------------------------------------------------
            int modifier;
            modifier = cl1.getModifiers();
            System.out.println("Modificadores: " + modifier);
            
            // ---------------------------------------------------------------
            Field field[];
            field = cl1.getDeclaredFields();
            
            for(int i=0; i<field.length; i++)
            {
                System.out.println("Fields: " + field[i].toString());
            }
            
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(UsoEmpleado.class.getName()).log(Level.SEVERE,
            null, ex);
        }

    }    
}


class Persona {
    private String nombre;
    public Persona(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
 }

class Empleado extends Persona
{
    private double salario;

    public Empleado(String nombre, double salario) 
    {
        super(nombre);
        this.salario=salario;
    }
    public void setIncentivo(double incentivo)
    {
        salario=salario+incentivo;
    }
    public String getSalario()
    {
        return "El salario es: " + salario;
    }
}
