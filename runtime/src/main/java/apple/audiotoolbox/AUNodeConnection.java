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





@Mapping("AUNodeConnection") @Library("AudioToolbox/AudioToolbox.h")
public class AUNodeConnection 
    extends Struct 
     {

    
    protected AUNodeConnection() {}
    
    
    @DotMapping("sourceNode")
    public native int getSourceNode();
    @DotMapping("sourceOutputNumber")
    public native int getSourceOutputNumber();
    @DotMapping("destNode")
    public native int getDestNode();
    @DotMapping("destInputNumber")
    public native int getDestInputNumber();
    
    public static native AUNodeConnection create(int sourceNode, int sourceOutputNumber, int destNode, int destInputNumber) /*-[
        AUNodeConnection __new = { .sourceNode = sourceNode, .sourceOutputNumber = sourceOutputNumber, .destNode = destNode, .destInputNumber = destInputNumber };
        return __new;
    ]-*/;
    public static native AUNodeConnection copyWithsourceNode(AUNodeConnection original, int sourceNode) /*-[
        AUNodeConnection __new = { .sourceNode = sourceNode, .sourceOutputNumber = original.sourceOutputNumber, .destNode = original.destNode, .destInputNumber = original.destInputNumber };
        return __new;
    ]-*/;

    
    public static native AUNodeConnection copyWithsourceOutputNumber(AUNodeConnection original, int sourceOutputNumber) /*-[
        AUNodeConnection __new = { .sourceNode = original.sourceNode, .sourceOutputNumber = sourceOutputNumber, .destNode = original.destNode, .destInputNumber = original.destInputNumber };
        return __new;
    ]-*/;

    
    public static native AUNodeConnection copyWithdestNode(AUNodeConnection original, int destNode) /*-[
        AUNodeConnection __new = { .sourceNode = original.sourceNode, .sourceOutputNumber = original.sourceOutputNumber, .destNode = destNode, .destInputNumber = original.destInputNumber };
        return __new;
    ]-*/;

    
    public static native AUNodeConnection copyWithdestInputNumber(AUNodeConnection original, int destInputNumber) /*-[
        AUNodeConnection __new = { .sourceNode = original.sourceNode, .sourceOutputNumber = original.sourceOutputNumber, .destNode = original.destNode, .destInputNumber = destInputNumber };
        return __new;
    ]-*/;

    
}
