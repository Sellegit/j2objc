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


@Mapping("MIDIThruConnectionParams") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIThruConnectionParams 
    extends Struct 
     {

    
    private MIDIThruConnectionParams() {}
    
    
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
    @DotMapping("filterOutAllControls")
    public native byte getFilterOutAllControls();
    @DotMapping("numControlTransforms")
    public native short getNumControlTransforms();
    @DotMapping("numMaps")
    public native short getNumMaps();

    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionParamsInitialize")
    public static native void initialize(MIDIThruConnectionParams inConnectionParams);

}
