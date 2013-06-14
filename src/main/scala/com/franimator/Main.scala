package com.franimator

import java.awt.BorderLayout
import java.awt.Rectangle
import javax.swing.JFrame

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    val franimator = new Franimator(List(new Rectangle(10, 10, 100, 100)))
    
    val frame = new JFrame("Franimator")
    frame.add(franimator, BorderLayout.CENTER)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setSize(800, 600)
    frame.setVisible(true)
    
    franimator.start
    
  }

}
