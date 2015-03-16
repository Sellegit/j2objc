package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;





@Library("CoreMedia/CoreMedia.h")
@Mapping("CMTextDisplayFlag")
public final class CMTextDisplayFlag extends ObjCEnum {
    
    @GlobalConstant("kCMTextDisplayFlag_scrollIn")
    public static final long scrollIn = 32L;
    @GlobalConstant("kCMTextDisplayFlag_scrollOut")
    public static final long scrollOut = 64L;
    @GlobalConstant("kCMTextDisplayFlag_scrollDirectionMask")
    public static final long scrollDirectionMask = 384L;
    @GlobalConstant("kCMTextDisplayFlag_scrollDirection_bottomToTop")
    public static final long scrollDirection_bottomToTop = 0L;
    @GlobalConstant("kCMTextDisplayFlag_scrollDirection_rightToLeft")
    public static final long scrollDirection_rightToLeft = 128L;
    @GlobalConstant("kCMTextDisplayFlag_scrollDirection_topToBottom")
    public static final long scrollDirection_topToBottom = 256L;
    @GlobalConstant("kCMTextDisplayFlag_scrollDirection_leftToRight")
    public static final long scrollDirection_leftToRight = 384L;
    @GlobalConstant("kCMTextDisplayFlag_continuousKaraoke")
    public static final long continuousKaraoke = 2048L;
    @GlobalConstant("kCMTextDisplayFlag_writeTextVertically")
    public static final long writeTextVertically = 131072L;
    @GlobalConstant("kCMTextDisplayFlag_fillTextRegion")
    public static final long fillTextRegion = 262144L;
    @GlobalConstant("kCMTextDisplayFlag_obeySubtitleFormatting")
    public static final long obeySubtitleFormatting = 536870912L;
    @GlobalConstant("kCMTextDisplayFlag_forcedSubtitlesPresent")
    public static final long forcedSubtitlesPresent = 1073741824L;
    @GlobalConstant("kCMTextDisplayFlag_allSubtitlesForced")
    public static final long allSubtitlesForced = -2147483648L;
    

}
