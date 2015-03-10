package apple.coremidi;


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





@Mapping("MIDIThruConnectionParams") @Library("CoreMIDI")
public class MIDIThruConnectionParams 
    extends Struct 
     {

    
    protected MIDIThruConnectionParams() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("numSources")
    public native int getNumSources();
    @DotMapping("sources")
    public native MIDIThruConnectionEndpoint getSources();
    @DotMapping("numDestinations")
    public native int getNumDestinations();
    @DotMapping("destinations")
    public native MIDIThruConnectionEndpoint getDestinations();
    @DotMapping("channelMap")
    public native ByteBuffer getChannelMap();
    @DotMapping("lowVelocity")
    public native byte getLowVelocity();
    @DotMapping("highVelocity")
    public native byte getHighVelocity();
    @DotMapping("lowNote")
    public native byte getLowNote();
    @DotMapping("highNote")
    public native byte getHighNote();
    @DotMapping("noteNumber")
    public native MIDITransform getNoteNumber();
    @DotMapping("velocity")
    public native MIDITransform getVelocity();
    @DotMapping("keyPressure")
    public native MIDITransform getKeyPressure();
    @DotMapping("channelPressure")
    public native MIDITransform getChannelPressure();
    @DotMapping("programChange")
    public native MIDITransform getProgramChange();
    @DotMapping("pitchBend")
    public native MIDITransform getPitchBend();
    @DotMapping("filterOutSysEx")
    public native byte getFilterOutSysEx();
    @DotMapping("filterOutMTC")
    public native byte getFilterOutMTC();
    @DotMapping("filterOutBeatClock")
    public native byte getFilterOutBeatClock();
    @DotMapping("filterOutTuneRequest")
    public native byte getFilterOutTuneRequest();
    @DotMapping("reserved2")
    public native ByteBuffer getReserved2();
    @DotMapping("filterOutAllControls")
    public native byte getFilterOutAllControls();
    @DotMapping("numControlTransforms")
    public native short getNumControlTransforms();
    @DotMapping("numMaps")
    public native short getNumMaps();
    @DotMapping("reserved3")
    public native ShortBuffer getReserved3();
    
    public static native MIDIThruConnectionParams create(int version, int numSources, MIDIThruConnectionEndpoint sources, int numDestinations, MIDIThruConnectionEndpoint destinations, ByteBuffer channelMap, byte lowVelocity, byte highVelocity, byte lowNote, byte highNote, MIDITransform noteNumber, MIDITransform velocity, MIDITransform keyPressure, MIDITransform channelPressure, MIDITransform programChange, MIDITransform pitchBend, byte filterOutSysEx, byte filterOutMTC, byte filterOutBeatClock, byte filterOutTuneRequest, ByteBuffer reserved2, byte filterOutAllControls, short numControlTransforms, short numMaps, ShortBuffer reserved3) /*-[
        MIDIThruConnectionParams __new = { .version = version, .numSources = numSources, .sources = sources, .numDestinations = numDestinations, .destinations = destinations, .channelMap = channelMap, .lowVelocity = lowVelocity, .highVelocity = highVelocity, .lowNote = lowNote, .highNote = highNote, .noteNumber = noteNumber, .velocity = velocity, .keyPressure = keyPressure, .channelPressure = channelPressure, .programChange = programChange, .pitchBend = pitchBend, .filterOutSysEx = filterOutSysEx, .filterOutMTC = filterOutMTC, .filterOutBeatClock = filterOutBeatClock, .filterOutTuneRequest = filterOutTuneRequest, .reserved2 = reserved2, .filterOutAllControls = filterOutAllControls, .numControlTransforms = numControlTransforms, .numMaps = numMaps, .reserved3 = reserved3 };
        return __new;
    ]-*/;
    public static native MIDIThruConnectionParams copyWithversion(MIDIThruConnectionParams original, int version) /*-[
        original.version = version;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithnumSources(MIDIThruConnectionParams original, int numSources) /*-[
        original.numSources = numSources;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithsources(MIDIThruConnectionParams original, MIDIThruConnectionEndpoint sources) /*-[
        original.sources = sources;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithnumDestinations(MIDIThruConnectionParams original, int numDestinations) /*-[
        original.numDestinations = numDestinations;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithdestinations(MIDIThruConnectionParams original, MIDIThruConnectionEndpoint destinations) /*-[
        original.destinations = destinations;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithchannelMap(MIDIThruConnectionParams original, ByteBuffer channelMap) /*-[
        original.channelMap = channelMap;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithlowVelocity(MIDIThruConnectionParams original, byte lowVelocity) /*-[
        original.lowVelocity = lowVelocity;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithhighVelocity(MIDIThruConnectionParams original, byte highVelocity) /*-[
        original.highVelocity = highVelocity;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithlowNote(MIDIThruConnectionParams original, byte lowNote) /*-[
        original.lowNote = lowNote;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithhighNote(MIDIThruConnectionParams original, byte highNote) /*-[
        original.highNote = highNote;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithnoteNumber(MIDIThruConnectionParams original, MIDITransform noteNumber) /*-[
        original.noteNumber = noteNumber;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithvelocity(MIDIThruConnectionParams original, MIDITransform velocity) /*-[
        original.velocity = velocity;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithkeyPressure(MIDIThruConnectionParams original, MIDITransform keyPressure) /*-[
        original.keyPressure = keyPressure;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithchannelPressure(MIDIThruConnectionParams original, MIDITransform channelPressure) /*-[
        original.channelPressure = channelPressure;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithprogramChange(MIDIThruConnectionParams original, MIDITransform programChange) /*-[
        original.programChange = programChange;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithpitchBend(MIDIThruConnectionParams original, MIDITransform pitchBend) /*-[
        original.pitchBend = pitchBend;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithfilterOutSysEx(MIDIThruConnectionParams original, byte filterOutSysEx) /*-[
        original.filterOutSysEx = filterOutSysEx;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithfilterOutMTC(MIDIThruConnectionParams original, byte filterOutMTC) /*-[
        original.filterOutMTC = filterOutMTC;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithfilterOutBeatClock(MIDIThruConnectionParams original, byte filterOutBeatClock) /*-[
        original.filterOutBeatClock = filterOutBeatClock;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithfilterOutTuneRequest(MIDIThruConnectionParams original, byte filterOutTuneRequest) /*-[
        original.filterOutTuneRequest = filterOutTuneRequest;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithreserved2(MIDIThruConnectionParams original, ByteBuffer reserved2) /*-[
        original.reserved2 = reserved2;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithfilterOutAllControls(MIDIThruConnectionParams original, byte filterOutAllControls) /*-[
        original.filterOutAllControls = filterOutAllControls;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithnumControlTransforms(MIDIThruConnectionParams original, short numControlTransforms) /*-[
        original.numControlTransforms = numControlTransforms;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithnumMaps(MIDIThruConnectionParams original, short numMaps) /*-[
        original.numMaps = numMaps;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionParams copyWithreserved3(MIDIThruConnectionParams original, ShortBuffer reserved3) /*-[
        original.reserved3 = reserved3;
        return __new;
    ]-*/;

    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionParamsInitialize")
    public native void initialize();
    
}
