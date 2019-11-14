
void setup() {
size (900, 900);
PImage face = loadImage("/home/leaguestudent/Downloads/dog.jpg");

image(face, 200, 200);
}
void draw() {
  fill(mouseY,1000000,mouseY);
ellipse (395,395,50,50);
ellipse (600,405,50,50);
fill(#000000);
ellipse (395,395,25,25);
ellipse (600,405,25,25);
}