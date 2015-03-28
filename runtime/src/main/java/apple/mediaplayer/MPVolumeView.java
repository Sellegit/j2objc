package apple.mediaplayer;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;


/**
 * @since Available in iOS 2.0 and later.
 */
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPVolumeView")
public class MPVolumeView 
    extends UIView 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:")
    public MPVolumeView(CGRect frame) { }
    @Mapping("init")
    public MPVolumeView() { }

    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("showsVolumeSlider")
    public native boolean showsVolumeSlider();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("setShowsVolumeSlider:")
    public native void setShowsVolumeSlider(boolean v);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("showsRouteButton")
    public native boolean showsRouteButton();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("setShowsRouteButton:")
    public native void setShowsRouteButton(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("areWirelessRoutesAvailable")
    public native boolean areWirelessRoutesAvailable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isWirelessRouteActive")
    public native boolean isWirelessRouteActive();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("volumeWarningSliderImage")
    public native UIImage getVolumeWarningSliderImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setVolumeWarningSliderImage:")
    public native void setVolumeWarningSliderImage(UIImage v);

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("MPVolumeViewWirelessRoutesAvailableDidChangeNotification")
    public static native NSString WirelessRoutesAvailableDidChangeNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("MPVolumeViewWirelessRouteActiveDidChangeNotification")
    public static native NSString WirelessRouteActiveDidChangeNotification();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setMinimumVolumeSliderImage:forState:")
    public native void setMinimumVolumeSliderImage(UIImage image, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setMaximumVolumeSliderImage:forState:")
    public native void setMaximumVolumeSliderImage(UIImage image, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setVolumeThumbImage:forState:")
    public native void setVolumeThumbImage(UIImage image, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("minimumVolumeSliderImageForState:")
    public native UIImage getMinimumVolumeSliderImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("maximumVolumeSliderImageForState:")
    public native UIImage getMaximumVolumeSliderImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("volumeThumbImageForState:")
    public native UIImage getVolumeThumbImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("volumeSliderRectForBounds:")
    public native CGRect getVolumeSliderRect(CGRect bounds);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("volumeThumbRectForBounds:volumeSliderRect:value:")
    public native CGRect getVolumeThumbRect(CGRect bounds, CGRect rect, float value);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRouteButtonImage:forState:")
    public native void setRouteButtonImage(UIImage image, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("routeButtonImageForState:")
    public native UIImage getRouteButtonImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("routeButtonRectForBounds:")
    public native CGRect getRouteButtonRect(CGRect bounds);

}
