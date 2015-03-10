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


@Mapping("MPMediaPlaylistAttribute")
public final class MPMediaPlaylistAttribute extends ObjCEnum {
    
    @GlobalConstant("MPMediaPlaylistAttributeNone")
    public static final long None = 0L;
    @GlobalConstant("MPMediaPlaylistAttributeOnTheGo")
    public static final long OnTheGo = 1L;
    @GlobalConstant("MPMediaPlaylistAttributeSmart")
    public static final long Smart = 2L;
    @GlobalConstant("MPMediaPlaylistAttributeGenius")
    public static final long Genius = 4L;
    

}
