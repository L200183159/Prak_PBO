/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public interface ActivityLampu {
    public static final int LAMPU_HIDUP = 1;
    public static final int LAMPU_MATI = 0;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
}

