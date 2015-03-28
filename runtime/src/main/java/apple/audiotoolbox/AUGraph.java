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

/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox/AudioToolbox.h")
public class AUGraph 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("NewAUGraph")
    public static native int create(Todo outGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphAddNode")
    public static native int addNode(OpaqueAUGraph inGraph, AudioComponentDescription inDescription, Todo outNode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphRemoveNode")
    public static native int removeNode(OpaqueAUGraph inGraph, int inNode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetNodeCount")
    public static native int getNodeCount(OpaqueAUGraph inGraph, Todo outNumberOfNodes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetIndNode")
    public static native int getIndNode(OpaqueAUGraph inGraph, int inIndex, Todo outNode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphNodeInfo")
    public static native int nodeInfo(OpaqueAUGraph inGraph, int inNode, AudioComponentDescription outDescription, Todo outAudioUnit);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphConnectNodeInput")
    public static native int connectNodeInput(OpaqueAUGraph inGraph, int inSourceNode, int inSourceOutputNumber, int inDestNode, int inDestInputNumber);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphSetNodeInputCallback")
    public static native int setNodeInputCallback(OpaqueAUGraph inGraph, int inDestNode, int inDestInputNumber, Todo inInputCallback);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphDisconnectNodeInput")
    public static native int disconnectNodeInput(OpaqueAUGraph inGraph, int inDestNode, int inDestInputNumber);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphClearConnections")
    public static native int clearConnections(OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetNumberOfInteractions")
    public static native int getNumberOfInteractions(OpaqueAUGraph inGraph, Todo outNumInteractions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetInteractionInfo")
    public static native int getInteractionInfo(OpaqueAUGraph inGraph, int inInteractionIndex, AUNodeInteraction outInteraction);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphCountNodeInteractions")
    public static native int countNodeInteractions(OpaqueAUGraph inGraph, int inNode, Todo outNumInteractions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetNodeInteractions")
    public static native int getNodeInteractions(OpaqueAUGraph inGraph, int inNode, Todo ioNumInteractions, AUNodeInteraction outInteractions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphUpdate")
    public static native int update(OpaqueAUGraph inGraph, Todo outIsUpdated);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphOpen")
    public static native int open(OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphInitialize")
    public static native int initialize(OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphUninitialize")
    public static native int uninitialize(OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphStart")
    public static native int start(OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphStop")
    public static native int stop(OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphIsOpen")
    public static native int isOpen(OpaqueAUGraph inGraph, Todo outIsOpen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphIsInitialized")
    public static native int isInitialized(OpaqueAUGraph inGraph, Todo outIsInitialized);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphIsRunning")
    public static native int isRunning(OpaqueAUGraph inGraph, Todo outIsRunning);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetCPULoad")
    public static native int getCPULoad(OpaqueAUGraph inGraph, Todo outAverageCPULoad);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphGetMaxCPULoad")
    public static native int getMaxCPULoad(OpaqueAUGraph inGraph, Todo outMaxLoad);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphAddRenderNotify")
    public static native int addRenderNotify(OpaqueAUGraph inGraph, FunctionPtr inCallback, Todo inRefCon);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AUGraphRemoveRenderNotify")
    public static native int removeRenderNotify(OpaqueAUGraph inGraph, FunctionPtr inCallback, Todo inRefCon);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetAUGraph")
    public static native int musicSequenceSet(OpaqueMusicSequence inSequence, OpaqueAUGraph inGraph);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetAUGraph")
    public static native int musicSequenceGet(OpaqueMusicSequence inSequence, Todo outGraph);

}
