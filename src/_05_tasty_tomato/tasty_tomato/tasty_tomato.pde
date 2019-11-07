void setup() {
    size(500, 500);
    background(100000, 100000, 100000);
    noStroke();
    fill(#F20A19);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#32D606);
    rect(176, 103, 12, 32);
    fill(#FFFFFF);
}
void draw() {
    if (mousePressed){
    ellipse(mouseX, mouseY, 25, 25);
    }
}