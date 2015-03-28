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
public class MPMediaEntityProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaEntityPropertyPersistentID")
    public static native NSString EntityPersistentIDValue();

}
