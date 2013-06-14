package com.franimator

import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Shape
import javax.swing.JPanel

class Franimator(val shapes: List[Shape]) extends JPanel with Runnable {
  
  def start() {
    new Thread(this).start
  }
  
  override def run() {
    while(true) {
      repaint()
      Thread.sleep(60)
    }
  }
  
  override def paintComponent(g: Graphics) {
    val g2d = g.asInstanceOf[Graphics2D]
    
    for(shape <- shapes) {
      g2d.fill(shape)
    }
  }
  
}
