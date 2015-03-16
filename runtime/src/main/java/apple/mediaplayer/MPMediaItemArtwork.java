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
 * @since Available in iOS 3.0 and later.
 */

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaItemArtwork")
public class MPMediaItemArtwork 
    extends NSObject 
     {

    
    
    public MPMediaItemArtwork() {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithImage:")
    public MPMediaItemArtwork(UIImage image) { }
    
    
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("imageCropRect")
    public native CGRect getImageCropRect();
    
    
    
    @Mapping("imageWithSize:")
    public native UIImage getImage(CGSize size);
    
}
