package com.ayproductions.extensions.tnparse;

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;

@DesignerComponent(version = 1,  description = "Thumbnail Parser Extension Tool",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "http://appyBuilder.com/extensions/icons/extension.png")
@SimpleObject(external = true)
public class TnParse extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    /**
     * @param container container, component will be placed in
     */
    public TnParse(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }
  
 	@SimpleFunction(description = "Gets YouTube video thumbnail")
  	public String GetThumbnailYouTube(String ytVideoId)
    {
      return "https://i3.ytimg.com/vi/" + ytVideoId + "/maxresdefault.jpg";
    }

    @SimpleFunction(description = "Gets Vimeo video thumbnail")
  	public String GetThumbnailVimeo(String vimeoVideoId)
    {
      return "https://vumbnail.com/" + vimeoVideoId + ".jpg";
    }

    @SimpleFunction(description = "Gets Dailymotion video thumbnail")
  	public String GetThumbnailDailymotion(String dailymotionVideoId)
    {
      return "https://www.dailymotion.com/thumbnail/video/" + dailymotionVideoId + ".jpg";
    }
  	
  
}
