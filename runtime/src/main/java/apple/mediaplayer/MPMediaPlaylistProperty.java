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

/*<javadoc>*/
/*</javadoc>*/
@Library("MediaPlayer/MediaPlayer.h")
public class MPMediaPlaylistProperty 
    extends MPMediaEntityProperty 
     {

    
    
    
    
    
    @GlobalConstant("MPMediaPlaylistPropertyPersistentID")
    public static native NSString PlaylistPersistendIDValue();
    @GlobalConstant("MPMediaPlaylistPropertyName")
    public static native NSString NameValue();
    @GlobalConstant("MPMediaPlaylistPropertyPlaylistAttributes")
    public static native NSString PlaylistAttributesValue();
    @GlobalConstant("MPMediaPlaylistPropertySeedItems")
    public static native NSString SeedItemsValue();

}
