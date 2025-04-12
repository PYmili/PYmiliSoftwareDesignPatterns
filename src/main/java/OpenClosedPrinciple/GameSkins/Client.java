package OpenClosedPrinciple.GameSkins;

/**
 * <h1>游戏皮肤的测试类，也是调用方</h1>
 * @author PYmili
 */
public class Client {
    public static void main(String[] args) {
        GameSkins skins = new GameSkins();
        // 使用默认皮肤
        skins.setSkins(new DefaultSkins());
        skins.display();
        // 使用自定义皮肤
        skins.setSkins(new CustomSkins());
        skins.display();
    }
}
