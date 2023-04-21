/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-12T14:59:33.656678300+01:00[Europe/Berlin]")
@Validated
@Tag(name = "transactions", description = "the transactions API")
public interface TransactionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /transactions/{transaction_type}/search : Get transactions
     * Get transactions
     *
     * @param transactionType  (required)
     * @param location Required when latitude and longitude aren&#39;t provided. Address of the location you want to deliver to. (optional)
     * @param latitude Required when latitude and longitude aren&#39;t provided. Address of the location you want to deliver to. (optional)
     * @param longitude Required when location isn&#39;t provided. Longitude of the location you want to deliver to. (optional)
     * @return Returns businesses (status code 200)
     *         or bad request (status code 400)
     */
    @Operation(
        operationId = "getTransactions",
        summary = "Get transactions",
        description = "Get transactions",
        responses = {
            @ApiResponse(responseCode = "200", description = "Returns businesses"),
            @ApiResponse(responseCode = "400", description = "bad request")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/transactions/{transaction_type}/search"
    )
    default ResponseEntity<Void> getTransactions(
        @Parameter(name = "transaction_type", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transaction_type") String transactionType,
        @Parameter(name = "location", description = "Required when latitude and longitude aren't provided. Address of the location you want to deliver to.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "location", required = false) String location,
        @Parameter(name = "latitude", description = "Required when latitude and longitude aren't provided. Address of the location you want to deliver to.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "latitude", required = false) String latitude,
        @Parameter(name = "longitude", description = "Required when location isn't provided. Longitude of the location you want to deliver to.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "longitude", required = false) String longitude
    ) {
        //Start Time:
        //End Time:

        //Add validation code here


        //

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
