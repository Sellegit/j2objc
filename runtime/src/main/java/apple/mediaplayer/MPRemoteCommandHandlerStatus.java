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
@Library("MediaPlayer/MediaPlayer.h")
@Mapping("MPRemoteCommandHandlerStatus")
public final class MPRemoteCommandHandlerStatus extends ObjCEnum {
    
    @GlobalConstant("MPRemoteCommandHandlerStatusSuccess")
    public static final long Success = 0L;
    @GlobalConstant("MPRemoteCommandHandlerStatusNoSuchContent")
    public static final long NoSuchContent = 100L;
    @GlobalConstant("MPRemoteCommandHandlerStatusCommandFailed")
    public static final long CommandFailed = 200L;


}
