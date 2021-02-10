package com.company;

import lombok.Getter;
import lombok.Setter;

public class TV {
    private @Getter final float m_tv_size;
    private @Getter final String m_model;
    private @Getter int m_current_channel;
    private @Getter @Setter boolean m_tv_on;
    private @Getter float price ;

    // allow only if new_channel > 0
    public void setM_current_channel(int new_channel){
        if ( new_channel>0) {
         m_current_channel= new_channel;
        }
    }

   // create ctor1 with m_tv_size, m_model, m_current_channel, m_tv_on
    public TV(float m_tv_size, String m_model, int m_current_channel, boolean m_tv_on) {
        this.m_tv_size = m_tv_size;
        this.m_model = m_model;
        this.m_current_channel = m_current_channel;
        this.m_tv_on = m_tv_on;
    }

    //  create ctor2 with m_tv_size, m_model, m_current_channel --> will call ctor1 with m_tv_on = false
      public TV(float m_tv_size, String m_model, int m_current_channel) {
       this( m_tv_size,m_model,m_current_channel,false);
    }

   // create ctor3 with m_tv_size, m_model  --> will call ctor1 with m_current_channel = 1, m_tv_on = false
     public TV (float m_tv_size,String m_model){
      this( m_tv_size,  m_model, 1, false);
     }

    //create ctor4 with m_tv_size --> will call ctor1 with m_model = "LG", m_current_channel = 1, m_tv_on = false
      public TV (float m_tv_size) {
        this (m_tv_size,"LG", 1, false);
      }

    //create ctor5 with no parameters --> will call ctor1 with m_tv_size = 65, m_model = "LG", m_current_channel = 1, m_tv_on = false

    public TV ( ) {
     this (65, "LG",1,false);
    }

    //add private @Getter final float price
   // create ctor6 with m_tv_size, m_model, m_current_channel, m_tv_on, price --> will call ctor1 with all parameters except price, and then will set the price

    public TV(float m_tv_size, String m_model, int m_current_channel, boolean m_tv_on, float price) {
        this( m_tv_size,  m_model,  m_current_channel,  m_tv_on);
        this.price = price;
   }

    @Override
    public String toString() {
        return "TV{" +
                "m_tv_size=" + m_tv_size +
                ", m_model='" + m_model + '\'' +
                ", m_current_channel=" + m_current_channel +
                ", m_tv_on=" + m_tv_on +
                ", price=" + price +
                '}';
    }
}
