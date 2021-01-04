import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable() {
		
		//registering items and their respective recipes
		ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
		
		
		NamespacedKey helmKey = new NamespacedKey(this, "chain_helmet");
		ShapedRecipe helmRec = new ShapedRecipe(helmet);
		helmRec.shape("---","-*-","***");
		helmRec.setIngredient('*', Material.AIR);
		helmRec.setIngredient('-', Material.CHAIN);
		
		ShapedRecipe helmRec2 = new ShapedRecipe(helmet);
		helmRec2.shape("***","---","-*-");
		helmRec2.setIngredient('*', Material.AIR);
		helmRec2.setIngredient('-', Material.CHAIN);
		
		NamespacedKey chestKey = new NamespacedKey(this, "chain_chestplate");
		ShapedRecipe chestRec = new ShapedRecipe(chestplate);
		chestRec.shape("-*-","---","---");
		chestRec.setIngredient('*', Material.AIR);
		chestRec.setIngredient('-', Material.CHAIN);
		
		NamespacedKey pantsKey = new NamespacedKey(this, "chain_leggings");
		ShapedRecipe pantsRec = new ShapedRecipe(leggings);
		pantsRec.shape("---","-*-","-*-");
		pantsRec.setIngredient('*', Material.AIR);
		pantsRec.setIngredient('-', Material.CHAIN);
		
		NamespacedKey bootsKey = new NamespacedKey(this, "chain_boots");
		ShapedRecipe bootsRec = new ShapedRecipe(boots);
		bootsRec.shape("***","-*-","-*-");
		bootsRec.setIngredient('*', Material.AIR);
		bootsRec.setIngredient('-', Material.CHAIN);
		
		ShapedRecipe bootsRec2 = new ShapedRecipe(boots);
		bootsRec2.shape("-*-","-*-","***");
		bootsRec2.setIngredient('*', Material.AIR);
		bootsRec2.setIngredient('-', Material.CHAIN);
		
		getServer().addRecipe(helmRec);	
		getServer().addRecipe(helmRec2);
		getServer().addRecipe(chestRec);
		getServer().addRecipe(pantsRec);
		getServer().addRecipe(bootsRec);
		getServer().addRecipe(bootsRec2);
	}
}
