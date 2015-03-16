package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("ExtendedNoteOnEvent") @Library("AudioToolbox/AudioToolbox.h")
public class ExtendedNoteOnEvent 
    extends Struct 
     {

    
    protected ExtendedNoteOnEvent() {}
    
    
    @DotMapping("instrumentID")
    public native int getInstrumentID();
    @DotMapping("groupID")
    public native int getGroupID();
    @DotMapping("duration")
    public native float getDuration();
    @DotMapping("extendedParams")
    public native MusicDeviceNoteParams getExtendedParams();
    
    public static native ExtendedNoteOnEvent create(int instrumentID, int groupID, float duration, MusicDeviceNoteParams extendedParams) /*-[
        ExtendedNoteOnEvent __new = { .instrumentID = instrumentID, .groupID = groupID, .duration = duration, .extendedParams = extendedParams };
        return __new;
    ]-*/;
    public static native ExtendedNoteOnEvent copyWithinstrumentID(ExtendedNoteOnEvent original, int instrumentID) /*-[
        ExtendedNoteOnEvent __new = { .instrumentID = instrumentID, .groupID = original.groupID, .duration = original.duration, .extendedParams = original.extendedParams };
        return __new;
    ]-*/;

    
    public static native ExtendedNoteOnEvent copyWithgroupID(ExtendedNoteOnEvent original, int groupID) /*-[
        ExtendedNoteOnEvent __new = { .instrumentID = original.instrumentID, .groupID = groupID, .duration = original.duration, .extendedParams = original.extendedParams };
        return __new;
    ]-*/;

    
    public static native ExtendedNoteOnEvent copyWithduration(ExtendedNoteOnEvent original, float duration) /*-[
        ExtendedNoteOnEvent __new = { .instrumentID = original.instrumentID, .groupID = original.groupID, .duration = duration, .extendedParams = original.extendedParams };
        return __new;
    ]-*/;

    
    public static native ExtendedNoteOnEvent copyWithextendedParams(ExtendedNoteOnEvent original, MusicDeviceNoteParams extendedParams) /*-[
        ExtendedNoteOnEvent __new = { .instrumentID = original.instrumentID, .groupID = original.groupID, .duration = original.duration, .extendedParams = extendedParams };
        return __new;
    ]-*/;

    
}
