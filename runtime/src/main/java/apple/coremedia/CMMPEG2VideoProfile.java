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






@Mapping("CMMPEG2VideoProfile")
public final class CMMPEG2VideoProfile extends ObjCEnum {
    
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_720p30")
    public static final long HDV_720p30 = 1751414321L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_1080i60")
    public static final long HDV_1080i60 = 1751414322L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_1080i50")
    public static final long HDV_1080i50 = 1751414323L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_720p24")
    public static final long HDV_720p24 = 1751414324L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_720p25")
    public static final long HDV_720p25 = 1751414325L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_1080p24")
    public static final long HDV_1080p24 = 1751414326L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_1080p25")
    public static final long HDV_1080p25 = 1751414327L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_1080p30")
    public static final long HDV_1080p30 = 1751414328L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_720p60")
    public static final long HDV_720p60 = 1751414329L;
    @GlobalConstant("kCMMPEG2VideoProfile_HDV_720p50")
    public static final long HDV_720p50 = 1751414369L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD_1080i60_VBR35")
    public static final long XDCAM_HD_1080i60_VBR35 = 2019849778L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD_1080i50_VBR35")
    public static final long XDCAM_HD_1080i50_VBR35 = 2019849779L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD_1080p24_VBR35")
    public static final long XDCAM_HD_1080p24_VBR35 = 2019849782L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD_1080p25_VBR35")
    public static final long XDCAM_HD_1080p25_VBR35 = 2019849783L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD_1080p30_VBR35")
    public static final long XDCAM_HD_1080p30_VBR35 = 2019849784L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_720p24_VBR35")
    public static final long XDCAM_EX_720p24_VBR35 = 2019849780L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_720p25_VBR35")
    public static final long XDCAM_EX_720p25_VBR35 = 2019849781L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_720p30_VBR35")
    public static final long XDCAM_EX_720p30_VBR35 = 2019849777L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_720p50_VBR35")
    public static final long XDCAM_EX_720p50_VBR35 = 2019849825L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_720p60_VBR35")
    public static final long XDCAM_EX_720p60_VBR35 = 2019849785L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_1080i60_VBR35")
    public static final long XDCAM_EX_1080i60_VBR35 = 2019849826L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_1080i50_VBR35")
    public static final long XDCAM_EX_1080i50_VBR35 = 2019849827L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_1080p24_VBR35")
    public static final long XDCAM_EX_1080p24_VBR35 = 2019849828L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_1080p25_VBR35")
    public static final long XDCAM_EX_1080p25_VBR35 = 2019849829L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_EX_1080p30_VBR35")
    public static final long XDCAM_EX_1080p30_VBR35 = 2019849830L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_720p50_CBR50")
    public static final long XDCAM_HD422_720p50_CBR50 = 2019833185L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_720p60_CBR50")
    public static final long XDCAM_HD422_720p60_CBR50 = 2019833145L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_1080i60_CBR50")
    public static final long XDCAM_HD422_1080i60_CBR50 = 2019833186L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_1080i50_CBR50")
    public static final long XDCAM_HD422_1080i50_CBR50 = 2019833187L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_1080p24_CBR50")
    public static final long XDCAM_HD422_1080p24_CBR50 = 2019833188L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_1080p25_CBR50")
    public static final long XDCAM_HD422_1080p25_CBR50 = 2019833189L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_1080p30_CBR50")
    public static final long XDCAM_HD422_1080p30_CBR50 = 2019833190L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD_540p")
    public static final long XDCAM_HD_540p = 2019846244L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_540p")
    public static final long XDCAM_HD422_540p = 2019846194L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_720p24_CBR50")
    public static final long XDCAM_HD422_720p24_CBR50 = 2019833140L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_720p25_CBR50")
    public static final long XDCAM_HD422_720p25_CBR50 = 2019833141L;
    @GlobalConstant("kCMMPEG2VideoProfile_XDCAM_HD422_720p30_CBR50")
    public static final long XDCAM_HD422_720p30_CBR50 = 2019833137L;
    @GlobalConstant("kCMMPEG2VideoProfile_XF")
    public static final long XF = 2019981873L;
    

}
