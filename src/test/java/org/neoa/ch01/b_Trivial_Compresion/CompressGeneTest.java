package org.neoa.ch01.b_Trivial_Compresion;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompressGeneTest {

    @Test
    void compressReturnExpected() {
        final String original = "TAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATATAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATA";
        CompressedGene compressedGene = new CompressedGene(original);
        String decompress = compressedGene.decompress();
        assertThat(decompress).isEqualTo(original);
    }
}
