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
 * @since Available in iOS 7.1 and later.
 */

@Library("MediaPlayer")
@Mapping("MPSeekCommandEventType")
public final class MPSeekCommandEventType extends ObjCEnum {
    
    @GlobalConstant("MPSeekCommandEventTypeBeginSeeking")
    public static final long BeginSeeking = 0L;
    @GlobalConstant("MPSeekCommandEventTypeEndSeeking")
    public static final long EndSeeking = 1L;
    

}
