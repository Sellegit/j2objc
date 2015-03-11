package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Library("AVFoundation")
@Mapping("AVAssetReferenceRestrictions")
public final class AVAssetReferenceRestrictions extends ObjCEnum {
    
    @GlobalConstant("AVAssetReferenceRestrictionForbidNone")
    public static final long None = 0L;
    @GlobalConstant("AVAssetReferenceRestrictionForbidRemoteReferenceToLocal")
    public static final long RemoteReferenceToLocal = 1L;
    @GlobalConstant("AVAssetReferenceRestrictionForbidLocalReferenceToRemote")
    public static final long LocalReferenceToRemote = 2L;
    @GlobalConstant("AVAssetReferenceRestrictionForbidCrossSiteReference")
    public static final long CrossSiteReference = 4L;
    @GlobalConstant("AVAssetReferenceRestrictionForbidLocalReferenceToLocal")
    public static final long LocalReferenceToLocal = 8L;
    @GlobalConstant("AVAssetReferenceRestrictionForbidAll")
    public static final long All = 65535L;
    

}
