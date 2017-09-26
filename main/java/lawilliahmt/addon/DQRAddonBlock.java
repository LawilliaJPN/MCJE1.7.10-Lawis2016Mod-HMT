package lawilliahmt.addon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;

public class DQRAddonBlock {
	public static Logger logger = LogManager.getLogger("handymobtools");

	/*テンプレート
	public static Block F; //()
	public static Block O;
	 */

	//敵対mob
	//クリーパー Creeper：自爆AI持ち✔
	public static Block SupiniF; //スピニー(昼)✔
	public static Block SupiniO;
	public static Block BakudaniwaF; //ばくだんいわ(夜)✔
	public static Block BakudaniwaO;
	public static Block BakudanbebiF; //ばくだんベビー(夜)✔
	public static Block BakudanbebiO;
	public static Block SamayoutamasiiF; //さまようたましい(夜)✔
	public static Block SamayoutamasiiO;
	public static Block SumairurokkuF; //スマイルロック(夜)✔
	public static Block SumairurokkuO;
	public static Block MegazarurokkuF; //メガザルロック(ネザー)✔
	public static Block MegazarurokkuO;
	public static Block KedamonF; //ケダモン(ネザー)✔
	public static Block KedamonO;
	public static Block DebirurodoF; //デビルロード(転生)✔
	public static Block DebirurodoO;
	public static Block NoroinoiwaF; //のろいの岩(転生)✔
	public static Block NoroinoiwaO;

	//エンダーマン Enderman：シャドー系✔
	public static Block AyasiikageF; //あやしいかげ(昼)
	public static Block AyasiikageO;
	public static Block HoroghostF; //ホロゴースト(夜)
	public static Block HoroghostO;
	public static Block MaounokageF; //まおうのかげ(ネザー)
	public static Block MaounokageO;
	public static Block SyadoF; //シャドー(夜)
	public static Block SyadoO;

	//シルバーフィッシュ SilverFish：ツボ、木箱、ミミック系。
	public static Block AkumanotuboF; //あくまのツボ(夜)
	public static Block AkumanotuboO;
	public static Block HitokuibakoF; //ひとくい箱()
	public static Block HitokuibakoO;
	public static Block HitokuikibakoF; //ひとくい木箱(昼)
	public static Block HitokuikibakoO;
	public static Block MimikkuF; //ミミック(ネザー)
	public static Block MimikkuO;
	public static Block MimikkukibakoF; //ミミック木箱()
	public static Block MimikkukibakoO;
	public static Block PandoraboxF; //パンドラボックス(エンド)
	public static Block PandoraboxO;
	public static Block PandorakibakoF; //パンドラ木箱()
	public static Block PandorakibakoO;
	public static Block TuboF; //つぼ()
	public static Block TuboO;
	public static Block TubokkuF; //ツボック(ネザー)
	public static Block TubokkuO;

	//スケルトン Skeleton：がいこつ系✔
	public static Block GaikotuF; //がいこつ(昼)
	public static Block GaikotuO;
	public static Block GaikotukensiF; //がいこつけんし(夜)
	public static Block GaikotukensiO;
	public static Block KagenokisiF; //かげのきし(エンド)
	public static Block KagenokisiO;
	public static Block SiryouF; //しりょう(ネザー)
	public static Block SiryouO;
	public static Block SiryounokisiF; //しりょうのきし(ネザー)
	public static Block SiryounokisiO;

	//ウィッチ Witch：ベビーサタン系、ドルイド系。
	public static Block BebingosatanF; //ベビンゴサタン(転生)
	public static Block BebingosatanO;
	public static Block BebisatanF; //ベビーサタン(夜)
	public static Block BebisatanO;
	public static Block DoruidoF; //ドルイド(昼)
	public static Block DoruidoO;
	public static Block GenjutusiF; //げんじゅつし(夜)
	public static Block GenjutusiO;
	public static Block KimendousiF; //きめんどうし(ネザー)
	public static Block KimendousiO;
	public static Block MinidemonF; //ミニデーモン(夜)
	public static Block MinidemonO;
	public static Block TukaimaF; //つかいま(昼)
	public static Block TukaimaO;

	//ゾンビ Zombie：アニマルゾンビ系、ゴースト系、スモールグール系。✔
	public static Block AnimaruzonbiF; //アニマルゾンビ(夜)
	public static Block AnimaruzonbiO;
	public static Block BariidodogF; //バリイドドッグ(ネザー)
	public static Block BariidodogO;
	public static Block BeroberoF; //ベロベロ(夜)
	public static Block BeroberoO;
	public static Block DesujakkaruF; //デスジャッカル(エンド)
	public static Block DesujakkaruO;
	public static Block GhostF; //ゴースト(夜)
	public static Block GhostO;
	public static Block HerughostF; //ヘルゴースト(夜)
	public static Block HerughostO;
	public static Block MetoroghostF; //メトロゴースト(夜)
	public static Block MetoroghostO;
	public static Block SumoruguruF; //スモールグール(夜)
	public static Block SumoruguruO;
	public static Block TutiwarasiF; //つちわらし(夜)
	public static Block TutiwarasiO;


	//中立mob
	//ブタ Pig：ビッグハット系✔
	public static Block ArukemisutonF; //アルケミストン(転生)
	public static Block ArukemisutonO;
	public static Block BigguhattoF; //ビッグハット(昼)
	public static Block BigguhattoO;
	public static Block MajikaruhattoF; //マジカルハット(ネザー)
	public static Block MajikaruhattoO;
	public static Block TonbureroF; //トンブレロ(夜)
	public static Block TonbureroO;

	//村人 Villager：カンダタ系。✔
	public static Block DesusutokaF; //デスストーカー(エンド)
	public static Block DesusutokaO;
	public static Block EriminatorF; //エリミネーター(ネザー)
	public static Block EriminatorO;
	public static Block GorotukiF; //ごろつき(夜)
	public static Block GorotukiO;
}
