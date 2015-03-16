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





@Mapping("AudioUnitNodeConnection") @Library("AudioToolbox/AudioToolbox.h")
public class AudioUnitNodeConnection 
    extends Struct 
     {

    
    protected AudioUnitNodeConnection() {}
    
    
    @DotMapping("sourceNode")
    public native int getSourceNode();
    @DotMapping("sourceOutputNumber")
    public native int getSourceOutputNumber();
    @DotMapping("destNode")
    public native int getDestNode();
    @DotMapping("destInputNumber")
    public native int getDestInputNumber();
    
    public static native AudioUnitNodeConnection create(int sourceNode, int sourceOutputNumber, int destNode, int destInputNumber) /*-[
        AudioUnitNodeConnection __new = { .sourceNode = sourceNode, .sourceOutputNumber = sourceOutputNumber, .destNode = destNode, .destInputNumber = destInputNumber };
        return __new;
    ]-*/;
    public static native AudioUnitNodeConnection copyWithsourceNode(AudioUnitNodeConnection original, int sourceNode) /*-[
        AudioUnitNodeConnection __new = { .sourceNode = sourceNode, .sourceOutputNumber = original.sourceOutputNumber, .destNode = original.destNode, .destInputNumber = original.destInputNumber };
        return __new;
    ]-*/;

    
    public static native AudioUnitNodeConnection copyWithsourceOutputNumber(AudioUnitNodeConnection original, int sourceOutputNumber) /*-[
        AudioUnitNodeConnection __new = { .sourceNode = original.sourceNode, .sourceOutputNumber = sourceOutputNumber, .destNode = original.destNode, .destInputNumber = original.destInputNumber };
        return __new;
    ]-*/;

    
    public static native AudioUnitNodeConnection copyWithdestNode(AudioUnitNodeConnection original, int destNode) /*-[
        AudioUnitNodeConnection __new = { .sourceNode = original.sourceNode, .sourceOutputNumber = original.sourceOutputNumber, .destNode = destNode, .destInputNumber = original.destInputNumber };
        return __new;
    ]-*/;

    
    public static native AudioUnitNodeConnection copyWithdestInputNumber(AudioUnitNodeConnection original, int destInputNumber) /*-[
        AudioUnitNodeConnection __new = { .sourceNode = original.sourceNode, .sourceOutputNumber = original.sourceOutputNumber, .destNode = original.destNode, .destInputNumber = destInputNumber };
        return __new;
    ]-*/;

    
}
