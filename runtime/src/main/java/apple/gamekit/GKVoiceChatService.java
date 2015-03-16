package apple.gamekit;


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
import apple.uikit.*;



/**
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit/GameKit.h") @Mapping("GKVoiceChatService")
public class GKVoiceChatService 
    extends NSObject 
     {

    
    
    public GKVoiceChatService() {}
    
    
    @Mapping("client")
    public native GKVoiceChatClient getClient();
    @Mapping("setClient:")
    public native void setClient(GKVoiceChatClient v);
    @Mapping("isMicrophoneMuted")
    public native boolean isMicrophoneMuted();
    @Mapping("setMicrophoneMuted:")
    public native void setMicrophoneMuted(boolean v);
    @Mapping("remoteParticipantVolume")
    public native float getRemoteParticipantVolume();
    @Mapping("setRemoteParticipantVolume:")
    public native void setRemoteParticipantVolume(float v);
    @Mapping("isOutputMeteringEnabled")
    public native boolean isOutputMeteringEnabled();
    @Mapping("setOutputMeteringEnabled:")
    public native void setOutputMeteringEnabled(boolean v);
    @Mapping("isInputMeteringEnabled")
    public native boolean isInputMeteringEnabled();
    @Mapping("setInputMeteringEnabled:")
    public native void setInputMeteringEnabled(boolean v);
    @Mapping("outputMeterLevel")
    public native float getOutputMeterLevel();
    @Mapping("inputMeterLevel")
    public native float getInputMeterLevel();
    
    
    
    @Mapping("startVoiceChatWithParticipantID:error:")
    protected native boolean startVoiceChat(String participantID, Todo error);
    @Mapping("stopVoiceChatWithParticipantID:")
    public native void stopVoiceChat(String participantID);
    @Mapping("acceptCallID:error:")
    protected native boolean acceptCallID(@MachineSizedSInt long callID, Todo error);
    @Mapping("denyCallID:")
    public native void denyCallID(@MachineSizedSInt long callID);
    @Mapping("receivedRealTimeData:fromParticipantID:")
    public native void receivedRealTimeData(NSData audio, String participantID);
    @Mapping("receivedData:fromParticipantID:")
    public native void receivedData(NSData arbitraryData, String participantID);
    @Mapping("defaultVoiceChatService")
    public static native GKVoiceChatService getDefaultVoiceChatService();
    @Mapping("isVoIPAllowed")
    public static native boolean isVoIPAllowed();
    
}
