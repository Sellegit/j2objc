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
@Mapping("CMVideoCodecType")
public final class CMVideoCodecType extends ObjCEnum {
    
    @GlobalConstant("kCMVideoCodecType_422YpCbCr8")
    public static final long _422YpCbCr8 = 846624121L;
    @GlobalConstant("kCMVideoCodecType_Animation")
    public static final long Animation = 1919706400L;
    @GlobalConstant("kCMVideoCodecType_Cinepak")
    public static final long Cinepak = 1668704612L;
    @GlobalConstant("kCMVideoCodecType_JPEG")
    public static final long JPEG = 1785750887L;
    @GlobalConstant("kCMVideoCodecType_JPEG_OpenDML")
    public static final long JPEG_OpenDML = 1684890161L;
    @GlobalConstant("kCMVideoCodecType_SorensonVideo")
    public static final long SorensonVideo = 1398165809L;
    @GlobalConstant("kCMVideoCodecType_SorensonVideo3")
    public static final long SorensonVideo3 = 1398165811L;
    @GlobalConstant("kCMVideoCodecType_H263")
    public static final long H263 = 1748121139L;
    @GlobalConstant("kCMVideoCodecType_H264")
    public static final long H264 = 1635148593L;
    @GlobalConstant("kCMVideoCodecType_MPEG4Video")
    public static final long MPEG4Video = 1836070006L;
    @GlobalConstant("kCMVideoCodecType_MPEG2Video")
    public static final long MPEG2Video = 1836069494L;
    @GlobalConstant("kCMVideoCodecType_MPEG1Video")
    public static final long MPEG1Video = 1836069238L;
    @GlobalConstant("kCMVideoCodecType_DVCNTSC")
    public static final long DVCNTSC = 1685480224L;
    @GlobalConstant("kCMVideoCodecType_DVCPAL")
    public static final long DVCPAL = 1685480304L;
    @GlobalConstant("kCMVideoCodecType_DVCProPAL")
    public static final long DVCProPAL = 1685483632L;
    @GlobalConstant("kCMVideoCodecType_DVCPro50NTSC")
    public static final long DVCPro50NTSC = 1685468526L;
    @GlobalConstant("kCMVideoCodecType_DVCPro50PAL")
    public static final long DVCPro50PAL = 1685468528L;
    @GlobalConstant("kCMVideoCodecType_DVCPROHD720p60")
    public static final long DVCPROHD720p60 = 1685481584L;
    @GlobalConstant("kCMVideoCodecType_DVCPROHD720p50")
    public static final long DVCPROHD720p50 = 1685481585L;
    @GlobalConstant("kCMVideoCodecType_DVCPROHD1080i60")
    public static final long DVCPROHD1080i60 = 1685481526L;
    @GlobalConstant("kCMVideoCodecType_DVCPROHD1080i50")
    public static final long DVCPROHD1080i50 = 1685481525L;
    @GlobalConstant("kCMVideoCodecType_DVCPROHD1080p30")
    public static final long DVCPROHD1080p30 = 1685481523L;
    @GlobalConstant("kCMVideoCodecType_DVCPROHD1080p25")
    public static final long DVCPROHD1080p25 = 1685481522L;
    @GlobalConstant("kCMVideoCodecType_AppleProRes4444")
    public static final long AppleProRes4444 = 1634743400L;
    @GlobalConstant("kCMVideoCodecType_AppleProRes422HQ")
    public static final long AppleProRes422HQ = 1634755432L;
    @GlobalConstant("kCMVideoCodecType_AppleProRes422")
    public static final long AppleProRes422 = 1634755438L;
    @GlobalConstant("kCMVideoCodecType_AppleProRes422LT")
    public static final long AppleProRes422LT = 1634755443L;
    @GlobalConstant("kCMVideoCodecType_AppleProRes422Proxy")
    public static final long AppleProRes422Proxy = 1634755439L;
    

}
