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





@Mapping("AUNodeRenderCallback")
public class AUNodeRenderCallback 
    extends Struct 
     {

    
    protected AUNodeRenderCallback() {}
    
    
    @DotMapping("destNode")
    public native int getDestNode();
    @DotMapping("destInputNumber")
    public native int getDestInputNumber();
    @DotMapping("cback")
    public native AURenderCallbackStruct getCback();
    
    public static native AUNodeRenderCallback create(int destNode, int destInputNumber, AURenderCallbackStruct cback) /*-[
        AUNodeRenderCallback __new = { .destNode = destNode, .destInputNumber = destInputNumber, .cback = cback };
        return __new;
    ]-*/;
    public static native AUNodeRenderCallback copyWithdestNode(AUNodeRenderCallback original, int destNode) /*-[
        original.destNode = destNode;
        return __new;
    ]-*/;

    
    public static native AUNodeRenderCallback copyWithdestInputNumber(AUNodeRenderCallback original, int destInputNumber) /*-[
        original.destInputNumber = destInputNumber;
        return __new;
    ]-*/;

    
    public static native AUNodeRenderCallback copyWithcback(AUNodeRenderCallback original, AURenderCallbackStruct cback) /*-[
        original.cback = cback;
        return __new;
    ]-*/;

    
}
