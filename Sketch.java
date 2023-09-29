import processing.core.PApplet;

  /**
  * A picture of a penguin with a igloo in the background (sized down - 300x300). 
  * @author: Zelyn Fung
  */

public class Sketch extends PApplet {
	
  public void settings() {
	// Size of Picture
    size(300, 300);
  }

  public void setup() {
  // Background Colour
    background(198, 219, 247);
  }

  public void draw() {
  //Background Drawing
    fill(255, 255, 255);
    stroke(10, 10, 10);
    strokeWeight(1);
    ellipse(150/2, 400/2, 425/2, 425/2);
    
  //Igloo Brick Outline
    stroke(10, 10, 10);
    strokeWeight(1);
    line(75/2, 200/2, 225/2, 200/2);
    line(0, 250/2, 302/2, 250/2);
    line(0, 306/2, 342/2, 306/2);
    line(0, 365/2, 357/2, 365/2);
    line(250/2, 306/2, 250/2, 250/2);
    line(155/2, 306/2, 155/2, 250/2);
    line(60/2, 306/2, 60/2, 250/2);
    line(295/2, 410/2, 295/2, 307/2);
    line(210/2, 410/2, 210/2, 307/2);
    line(100/2, 410/2, 100/2, 307/2);
    line(20/2, 410/2, 20/2, 307/2);
    line(210/2, 250/2, 210/2, 200/2);
    line(100/2, 200/2, 100/2, 250/2);

  //Background Drawing
    fill(75, 104, 250);
    stroke(10, 10, 10);
    strokeWeight(2);
    ellipse(155/2, 390/2, 145/2, 175/2); 

    fill(255, 255, 255);
    stroke(255, 255, 255);
    rect(0, 370/2, 650/2, 600/2);
    ellipse(370/2, 280/2, 10/2, 10/2);
    ellipse(300/2, 100/2, 10/2, 10/2);
    ellipse(50/2, 100/2, 10/2, 10/2);
    ellipse(100/2, 30/2, 10/2, 10/2);
    ellipse(175/2, 90/2, 10/2, 10/2);
    ellipse(230/2, 170/2, 10/2, 10/2);
    ellipse(40/2, 200/2, 10/2, 10/2);
    ellipse(130/2, 160/2, 10/2, 10/2);
    ellipse(300/2, 350/2, 10/2, 10/2);
    ellipse(500/2, 100/2, 10/2, 10/2);
    ellipse(600/2, 50/2, 10/2, 10/2);
    ellipse(500/2, 170/2, 10/2, 10/2);
    ellipse(450/2, 30/2, 10/2, 10/2);
    ellipse(370/2, 180/2, 10/2, 10/2);
    ellipse(375/2, 250/2, 10/2, 10/2);

	// Penguin Body
    fill(250, 165, 75);
    stroke(250, 165, 75);
    ellipse(435/2, 455/2, 40/2, 40/2);
    ellipse(515/2, 455/2, 40/2, 40/2);
  
    fill(39, 74, 168);
    stroke(39, 74, 168);
    ellipse(475/2, 370/2, 200/2, 130/2);
    
    fill(96, 137, 247);
    stroke(96, 137, 247);
    ellipse(475/2, 300/2, 150/2, 150/2);
    ellipse(475/2, 370/2, 165/2, 185/2);

    fill(255, 255, 255);
    stroke(255, 255, 255);
    ellipse(500/2, 300/2, 50/2, 50/2);
    ellipse(450/2, 300/2, 50/2, 50/2);
    ellipse(475/2, 370/2, 130/2, 150/2);
    
    fill(10, 10, 10);
    ellipse(500/2, 300/2, 25/2, 25/2);
    ellipse(450/2, 300/2, 25/2, 25/2);

    fill(250, 165, 75);
    ellipse(475/2, 315/2, 25/2, 25/2);
    
  }
}