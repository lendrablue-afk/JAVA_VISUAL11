public class GameCharacter {          // nama class = nama file
    private String name;
    private int health;
    private int level;

    public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String showName() {
        return this.name;
    }
        public int showLevel() {
            return this.level;
        }
        public int showHealth() {
            return this.health;
        }  
        public void levelUp() {
            this.level += 1;
}
}