package OpenClosedPrinciple.GameSkins;

/**
 * <h1>游戏皮肤类</h1>
 * @author PYmili
 */
public class GameSkins {
    AbstractGameSkins skins;

    public void setSkins(AbstractGameSkins skins) {
        this.skins = skins;
    }

    public void display() {
        skins.display();
    }
}
