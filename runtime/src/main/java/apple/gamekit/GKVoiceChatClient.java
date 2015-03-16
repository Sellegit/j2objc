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





@Library("GameKit/GameKit.h") @Mapping("GKVoiceChatClient")
public interface GKVoiceChatClient 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("voiceChatService:sendData:toParticipantID:")
    void sendData(GKVoiceChatService voiceChatService, NSData data, String participantID);
    @Mapping("participantID")
    String getParticipantID();
    @Mapping("voiceChatService:sendRealTimeData:toParticipantID:")
    void sendRealTimeData(GKVoiceChatService voiceChatService, NSData data, String participantID);
    @Mapping("voiceChatService:didStartWithParticipantID:")
    void didStart(GKVoiceChatService voiceChatService, String participantID);
    @Mapping("voiceChatService:didNotStartWithParticipantID:error:")
    void didNotStart(GKVoiceChatService voiceChatService, String participantID, NSError error);
    @Mapping("voiceChatService:didStopWithParticipantID:error:")
    void didStop(GKVoiceChatService voiceChatService, String participantID, NSError error);
    @Mapping("voiceChatService:didReceiveInvitationFromParticipantID:callID:")
    void didReceiveInvitation(GKVoiceChatService voiceChatService, String participantID, @MachineSizedSInt long callID);
    
    /*<adapter>*/
    /*</adapter>*/
}
