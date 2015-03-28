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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class GKVoiceChatClientAdapter 
    extends Object 
    implements GKVoiceChatClient {

    
    
    


    
    
    @NotImplemented("voiceChatService:sendData:toParticipantID:")
    public void sendData(GKVoiceChatService voiceChatService, NSData data, String participantID) { throw new UnsupportedOperationException(); }
    @NotImplemented("participantID")
    public String getParticipantID() { throw new UnsupportedOperationException(); }
    @NotImplemented("voiceChatService:sendRealTimeData:toParticipantID:")
    public void sendRealTimeData(GKVoiceChatService voiceChatService, NSData data, String participantID) { throw new UnsupportedOperationException(); }
    @NotImplemented("voiceChatService:didStartWithParticipantID:")
    public void didStart(GKVoiceChatService voiceChatService, String participantID) { throw new UnsupportedOperationException(); }
    @NotImplemented("voiceChatService:didNotStartWithParticipantID:error:")
    public void didNotStart(GKVoiceChatService voiceChatService, String participantID, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("voiceChatService:didStopWithParticipantID:error:")
    public void didStop(GKVoiceChatService voiceChatService, String participantID, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("voiceChatService:didReceiveInvitationFromParticipantID:callID:")
    public void didReceiveInvitation(GKVoiceChatService voiceChatService, String participantID, @MachineSizedSInt long callID) { throw new UnsupportedOperationException(); }

}
