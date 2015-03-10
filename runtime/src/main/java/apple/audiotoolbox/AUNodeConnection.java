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





@Mapping("AUNodeConnection")
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
        original.sourceNode = sourceNode;
        return __new;
    ]-*/;

    
    public static native AUNodeConnection copyWithsourceOutputNumber(AUNodeConnection original, int sourceOutputNumber) /*-[
        original.sourceOutputNumber = sourceOutputNumber;
        return __new;
    ]-*/;

    
    public static native AUNodeConnection copyWithdestNode(AUNodeConnection original, int destNode) /*-[
        original.destNode = destNode;
        return __new;
    ]-*/;

    
    public static native AUNodeConnection copyWithdestInputNumber(AUNodeConnection original, int destInputNumber) /*-[
        original.destInputNumber = destInputNumber;
        return __new;
    ]-*/;

    
}
