package Main.Backend;

public class Particle {
    private Position pos;
    private Index index;
    private float radius;
    private int id;

    public Particle() {

    }

    public Particle(Position pos, float radius){
        this.pos = pos;
        this.radius = radius;
    }

    public Particle(float x, float y, float radius){
        this.pos = new Position(x, y);
        this.radius = radius;
    }

    public boolean IsInsideActionRadiusOf(Particle otherParticle, float actionRadius){
        float squareActionRadiusPlusRadius = (float) Math.pow(actionRadius + radius + otherParticle.radius, 2);
        return squareActionRadiusPlusRadius >= otherParticle.pos.SquaredDistanceFrom(pos);
    }

    public Position getPos(){
        return pos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIndex(int x, int y){
        this.index = new Index(x, y);
    }

    public Index getIndex(){
        return this.index;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setPosition(float x, float y){
        this.pos = new Position(x, y);
    }
}
