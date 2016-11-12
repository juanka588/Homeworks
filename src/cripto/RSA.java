/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JuanCamilo
 */
public class RSA {

    private static int N_BLOCKS = 6;

    public static void main(String[] args) {
        BigInteger p = null, q = null, e = null, m = null;
        BigInteger[] params = new BigInteger[]{p, q, e, m};
        if (args.length != 4) {
            System.out.println("bad usage.\n p q e m ");
            return;
        }
        /*
         Scanner scan = new Scanner(System.in);
         for (int i = 0; i < params.length; i++) {
         params[i]=new BigInteger(scan.nextLine());
         }
         */
        p = new BigInteger(args[0]);
        q = new BigInteger(args[1]);
        e = new BigInteger(args[2]);
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        if (!e.gcd(phi).equals(BigInteger.ONE)) {
            System.out.println("no co-prime: " + e.toString() + " " + phi.toString());
            return;
        }
        BigInteger d = BigIntEuclidean.calculate(phi, e).y;
        if (d.compareTo(BigInteger.ZERO) < 0) {
            d = d.add(phi);
        }
        System.out.println("message: ");
        List<String> blocks = Utils.splitString(args[3], (int) Math.ceil(args[3].length() * 1.0 / N_BLOCKS));
        System.out.println(Arrays.toString(blocks.toArray()));
        List<BigInteger> cypherBlocks = new ArrayList<>();
        for (String block : blocks) {
            m = new BigInteger(block);
            BigInteger encode = encode(n, e, m);
            cypherBlocks.add(encode);
        }
        System.out.println("cypher");
        System.out.println(Arrays.toString(cypherBlocks.toArray()));
        List<BigInteger> original = new ArrayList<>();
        for (BigInteger cypher : cypherBlocks) {
            original.add(decode(n, d, cypher));
        }
        System.out.println("decoded");
        System.out.println(Arrays.toString(original.toArray()));
    }

    private static BigInteger encode(BigInteger n, BigInteger e, BigInteger m) {
        BigInteger ans = m.modPow(e, n);
        return ans;
    }

    private static BigInteger decode(BigInteger n, BigInteger d, BigInteger c) {
        BigInteger ans = c.modPow(d, n);
        return ans;
    }
}
