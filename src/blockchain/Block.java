package blockchain;

import java.io.UnsupportedEncodingException;
import java.util.Date;



public class Block {

    private int id;

    private int nonce;

    private long timeStamp;

    private String hash;

    private String previousHash;

    private String transaction;

    public Block(int id, String transaction, String previousHash) throws UnsupportedEncodingException {
        this.id = id;
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        generateHash();
    }

    public void generateHash() throws UnsupportedEncodingException {
        String dateToHash = Integer.toString(id)+previousHash+Long.toString(timeStamp) + Integer.toString(nonce) + transaction.toString();

        String hashValue = SHA256Helper.generateHash(dateToHash);

        this.hash = hashValue;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return this.previousHash;
    }

    public void  setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public void incrementNonce() {
        this.nonce++;
    }
    @Override

    public String toString() {

        return this.id+"-"+this.transaction+"-"+this.hash+"-"+this.previousHash+"-";

    }
}
