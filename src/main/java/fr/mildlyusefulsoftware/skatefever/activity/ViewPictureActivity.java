package fr.mildlyusefulsoftware.skatefever.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1500aa282825a4";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://tribosp.files.wordpress.com/2008/10/skate.jpg",
				"http://www.journaldugamer.com/images/2006_12/skate_1.jpg",
				"http://download.gameblog.fr/images/jeux/3485/Skate_2_Multi_Edit006.jpg",
				"http://www.mikaz.fr/blog/images/2009/03/skate-quai-5.jpg",
				"http://img.jeuxvideo.fr/028A016D00373989-c1-photo-skate.jpg",
				"http://cdn-gulli.ladmedia.fr/var/jeunesse/storage/images/canalj/la-tele/series/les-jo-de-canal-j/images/bmx-et-skate/skate-2/4380839-1-fre-FR/Skate-2_image_player_432_324.jpg",
				"http://download.gameblog.fr/images/jeux/3485/Skate_2_Multi_Edit018.jpg",
				"http://ykw.fr/wp-content/uploads/2011/04/Naked-Foot-Skate-2.png",
				"http://goldenrailskate.com/wp-content/uploads/2012/02/tumblr_ltda7bzuLu1r3sxlao1_1280.jpg",
				"http://www.mikaz.fr/blog/images/2009/03/skate-quai-1.thumbnail.jpg",
				"http://www.cccb.org/rcs_gene/blanca_skaters_bcn.jpg",
				"http://blog.france-trampoline.com/wp-content/uploads/2010/08/skate-trampoline.jpg",
				"http://phototrend.fr/wp-content/uploads/2009/03/skate.jpg",
				"http://www.netslide.com/photos/speed/skate/download/skate-0002.jpg",
				"http://www.only-apartments.com/images/only-apartments/2488/domaine-publique-skateboard-paris.jpg",
				"http://www.freetux.net/wp-content/uploads/2010/06/kilian-martin-skate-escalation.jpg",
				"http://www.e-rampe.com/images/cat/2.jpg",
				"http://rouen.blogs.com/photos/uncategorized/skate_park_00_ok.jpg",
				"http://www.dynamictic.info/wp-content/uploads/2010/07/killian_martin-skate.jpg",
				"http://data0.eklablog.com/les-rideurs/mod_article2966575_1.jpg?943",
				"http://www.sudouest.fr/images/2012/06/03/manche-du-championnat-de-france-de-skateboard-a-bordeaux_787982_460x306p.jpg",
				"http://skateboarders.le-site-du-skateboard.com/files/2009/12/adelmo-Jr-skateboard-rasta-stairs.jpg",
				"http://www.tuvie.com/wp-content/uploads/soularc-skateboard5.jpg",
				"http://farm2.static.flickr.com/1146/696351855_ea139b3f73.jpg",
				"http://www.sudouest.fr/images/2012/06/03/manche-du-championnat-de-france-de-skateboard-a-bordeaux_787980_460x306p.jpg",
				"http://i2.lulzimg.com/7186266777.jpg",
				"http://www.sudouest.fr/images/2012/06/03/manche-du-championnat-de-france-de-skateboard-a-bordeaux_787985_460x306p.jpg",
				"http://skateboarders.le-site-du-skateboard.com/files/P-rod-girl-skateboard.jpg",
				"http://www.ucpa-vacances.com/download/fstore/sport/page-produit/skateboard-juniors-00009944.jpg",
				"http://beachmontain.blogs.ipag.fr/files/skateboard.jpg",
				"http://skateboardcompanies.le-site-du-skateboard.com/files/2012/04/Evo-Skateboard-electrique-4.jpg",
				"http://nantes.leboost.com/actualite/2012/l110-championnats-de-france-de-skateboard-2012.jpg",
				"http://www.fubiz.net/wp-content/uploads/2012/02/wait-for-it-skateboard5-550x306.jpg",
				"http://reportages.le-site-du-skateboard.com/files/2012/07/Quiksilver-france-tour-601x333.jpg",
				"http://reportages.le-site-du-skateboard.com/files/2012/05/back-smith-villemin-friche.jpg",
				"http://fab44.jalbum.net/Championnat%20de%20France%20de%20skate%20%C3%A0%20Nantes/slides/championnat%20de%20France%20skate%202012%20Nantes%20jpeg%20D300%20%209.jpg",
				"http://farm6.static.flickr.com/5129/5260587313_bcab1d93b2.jpg",
				"http://www.shittm.com/bilder/SteffenAusterheim_Fs_Five-o.jpg",
				"http://girlsriders.org/wp-content/uploads/2011/03/Graciekotg.jpg",
				"http://www.behindmagazine.com/contents/wp-content/uploads/2010/07/Italian_championship_01.jpg",
				"http://www.yukon-news.com/news_images/2012/july/04/skateboard1.jpg",
				"http://admatch-syndication.mochila.com/as3-pimg/GettyImagesInc/GettyImagesNews/2009/07/24/Skateboarding_World_Championship-28541.largeslideshow.jpg",
				"http://www.addisonindependent.com/files/images/skate0068.leadphoto.jpg",
				"http://www.robcurrie.co.uk/spob6.jpg",
				"http://farm1.static.flickr.com/30/50034814_7c7f56dacb.jpg",
				"http://25.media.tumblr.com/tumblr_l0r4o41UuV1qzvx0to1_500.jpg"
				
				
				
				
				
				
				
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("skatefever",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
