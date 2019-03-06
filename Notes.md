# URI e URL
## URI
>Gli **URI** (**Uniform Resource Identifier**) forniscono un meccanismo semplice ed estensibile per identificare una risorsa. 

>Con il termine **risorsa** intendiamo qualunque entità abbia una identità: un documento, un’immagine, un servizio, una collezione di altre risorse.

### Caratteristiche URI:
-   È un concetto generale: non fa riferimento necessariamente a risorse accessibili tramite HTTP o a entità disponibili in rete.
-   È mapping concettuale ad una entità: non si riferisce
necessariamente ad una particolare versione dell’entità
esistente in un dato momento. 

Mapping può rimanere inalterato anche se cambia il contenuto della risorsa.

Gli URI rispettano una **sintassi standard**, semplice e
regolare, gli identificatori sono **uniformi**. 

>Un identificatore è un frammento di informazione che fa
riferimento ad una entità dotata di un’identità (risorsa).

Nel caso degli URI gli identificatori sono stringhe con una sintassi definita, dipendente dallo schema, che può essere espressa nella forma più generale in questo modo:
```xml
<scheme>:<scheme-specific-part>
```
Per la componente <scheme-specific-part> non esiste una struttura o una semantica comune a tutti gli URI.
Esiste però un sottoinsieme di URI che condivide una
sintassi comune per rappresentare relazioni gerarchiche in uno spazio di nomi: 
```xml
<scheme>://<authority><path>?<query>
```
A parte *\<scheme\>*, le altre parti possono talora essere
omesse, come nei casi in cui non è inclusa la componente
*\<authority\>* o non è inclusa la componente *\<query\>*.

## URN e URL
Esistono due specializzazioni del concetto di URI:
-   >**Uniform Resource Name (URN)**: identifica una
risorsa per mezzo di un “nome” in un
particolare dominio di nomi *(namespace)* che deve essere
globalmente unico e restare valido anche se la
risorsa diventa non disponibile o cessa di esistere. Deve essere unico e duraturo. Consente di "parlare" di una risorsa prescindendo dalla sua ubicazione e dalle modalità con cui è possibile accedervi.
-   >**Uniform Resource Locator (URL)**: identifica una
risorsa per mezzo del suo meccanismo di accesso
primario (es. locazione nella rete) piuttosto che
sulla base del suo nome o dei suoi attributi.

Un esempio molto noto di URN è il codice ISBN che identifica a livello internazionale in modo univoco e duraturo un libro o una edizione di un libro di un determinato editore: *(isbn: schema, 0-9553010-9 nome univoco nel namespace)*
```
isbn:0-9553010-9
```
## URL
Un URL tiene conto anche della modalità per accedere
alla risorsa, specifica il protocollo necessario per il trasferimento della risorsa stessa (non solo HTTP, quindi...). Tipicamente il nome dello schema corrisponde al protocollo utilizzato. La parte rimanente del nome dipende dal protocollo. Nella sua forma più comune (schema HTTP-like) la sintassi è: 
```xml
<protocol>://[<username>:<password>@]<host>[:<port>][/<path>[?<query>][#fragment]]
```

### Componenti URL
-   **\<protocol\>**: Descrive il protocollo da utilizzare per l'accesso al server (HTTP, HTTPS, FTP, MMS, ...)
-   **\<username\>:\<password\>@**: credenziali per l'autenticazione 
-   **\<host\>**: indirizzo server su cui risiede la risorsa. Può essere un indirizzo IP logico o fisico.
-   **\<port\>**: definisce la porta da utilizzare (TCP come protocollo di trasporto per HTTP, che vedremo è a livello applicativo) . Se non viene indicata, si usa porta standard per il protocollo specificato (per HTTP è 80).
-   **\<path\>**: percorso (pathname) che identifica la risorsa nel file system del server. Se manca, tipicamente si accede alla risorsa predefinita (es. home page).
-   **\<query\>**: una stringa di caratteri che consente di passare al server uno o più parametri . Di solito ha questo formato: *parametro1=valore&parametro2=valore2...*

## URI opache e URI generiche
-   >**URI opaca**: non è soggetta a ulteriori operazioni di
parsing:
    -   mailto:paolo.rossi@disi.unibo.it
-   >**URI gerarchica**: è soggetta a ulteriori operazioni di parsing, per esempio per separare l’indirizzo del server dal percorso all’interno file system:
    -   http://informatica.unibo.it/
    -   docs/guide/collections/designfaq.html#28

#### Operazioni sulle URI gerarchiche

-   >**Normalizzazione**: processo di rimozione dei segmenti "." e ".. " (e altri caratteri speciali) dal path di una URI gerarchica. Si applica solo a URI gerarchiche, su URI opache non ha effetto.
-   >**Risoluzione**: è il processo che a partire da una URI originaria porta all’ottenimento di una URI risultante. La URI originaria viene risolta basandosi su una terza URI, detta **base URI**.
-   >**Relativizzazione** è il processo inverso alla risoluzione.

# HTTP
>HTTP (Hyper Text Transfer Protocol) è il protocollo di livello applicativo utilizzato per trasferire le risorse Web (pagine o elementi di pagina) da server a client. Gestisce sia le richieste (URL) inviate al server che le risposte inviate al client (pagine).

È un protocollo **stateless**: né il server né il client mantengono, a livello di protocollo, informazioni relative ai messaggi precedentemente scambiati.
Sia le richieste al server che le risposte ai client sono
trasmesse usando stream TCP.
>**Client**: programma applicativo che stabilisce una
connessione al fine di inviare delle richieste.

>**Server**: programma applicativo che accetta connessioni al fine di ricevere richieste ed inviare specifiche risposte con le risorse richieste.

>**Connessione**: circuito virtuale stabilito a livello di trasporto tra due applicazioni per fini di comunicazione.

>**Messaggio**: è l’unità base di comunicazione HTTP, è definita come una specifica sequenza di byte concettualmente atomica.

>**Request**: messaggio HTTP di richiesta.

>**Response**: messaggio HTTP di risposta.

>**Resource**: oggetto di tipo dato univocamente definito.

>**URI**: Uniform Resource Identifier – identificatore unico per una risorsa.

>**Entity**: rappresentazione di una risorsa, può essere
incapsulata in un messaggio, tipicamente di risposta.


Segue uno schema tipo:
-   server rimane in ascolto (server passivo), tipicamente sulla porta 80.
-   client apre una connessione TCP sulla porta 80.
-   server accetta la connessione.
-   client manda una richiesta.
-   server invia la risposta e chiude la connessione7

![](Pictures/1.03.1.png)

## Differenze tra HTTP v1.0 e v1.1

La differenza principale tra HTTP 1.0 e 1.1 è la possibilità di specificare coppie multiple di richiesta e risposta nella stessa connessione. Le connessioni 1.0 vengono dette **non persistenti** mentre quelle 1.1 vengono definite **persistenti**. Il server HTTP chiude la connessione quando viene specificato nell’header del messaggio (desiderata da parte del cliente) oppure quando non è usata da un certo tempo (time out).

### Pipeling 
>Il pipelining consiste nell’invio di molteplici richieste da parte del client prima di terminare la ricezione delle risposte. Le risposte debbono però essere date nello stesso ordine delle richieste , poiché non è specificato un metodo esplicito di associazione tra richiesta e risposta.

## Messaggi HTTP
È definito da due strutture:
>**Message Header**: contiene tutte le informazioni  necessarie per identificazione del messaggio (più in generale tutte le intestazioni del messaggio).

>**Message Body**: contiene i dati trasportati dal
messaggio.

I messaggi di **Response** contengono i dati relativi alle **risorse richieste** (tipicamente una pagina html). I dati sono **codificati secondo il formato** specificato nell’header.

## Header HTTP
>Gli header sono costituiti da insiemi di coppie (nome:
valore) che specificano caratteristiche del messaggio
trasmesso o ricevuto:
-   Header *generali della trasmissione* (Data, codifica, versione, tipo di comunicazione, ecc.)
-   Header *relativi all’entità trasmessa* (Content-type, Content-Length, data di scadenza, ecc.)
-   Header riguardo la *richiesta effettuata* (chi fa la richiesta, a chi viene fatta la richiesta, ecc.)
-   Header della *risposta generata* (che server dà la risposta, che tipo di autorizzazione è necessaria, ecc.)

Il protocollo utilizza messaggi in formato ASCII (testo
leggibile; qui un esempio:
![](Pictures/1.03.2.png)

## I comandi della richiesta
### GET

-   Serve per richiedere una risorsa ad un server. È il metodo più frequente: è quello che viene attivato facendo click su un link ipertestuale di un documento HTML, o specificando un URL nell’apposito campo di un browser. 
-   È previsto il passaggio di parametri (la parte \<query\> dell’URL). 
-   La lunghezza massima di un URL è limitata.

### POST
-   Progettato come il messaggio per richiedere una risorsa. 
-   A differenza di GET, i dettagli per identificazione ed elaborazione della risorsa stessa non sono nell’URL, ma sono contenuti nel body messaggio.
-   Non ci sono limiti di lunghezza nei parametri di una richiesta.
-   Si ha una trasmissione di informazioni cliente -> servitore che però non porta alla creazione di una risorsa sul server.

### PUT
-   Chiede la memorizzazione sul server di una risorsa all’URL specificato.
-   A differenza del POST però si ha la creazione di una risorsa (o la sua sostituzione se esisteva già).
-   L’argomento del metodo PUT è la risorsa che ci si aspetta di ottenere facendo un GET con lo stesso nome in seguito.

### DELETE 
Richiede la cancellazione della risorsa riferita dall’URL specificato.

### HEAD
-   È simile al metodo GET, ma il server deve rispondere soltanto con gli header relativi, senza body.
-   Viene usato per verificare un URL:
    -   Validità: la risorsa esiste e non è di lunghezza zero.
    -   Accessibilità: non è richiesta autenticazione.

### OPTIONS 
Serve per richiedere informazioni sulle opzioni disponibili per la comunicazione.

### TRACE
-   È usato per invocare il loop-back remoto a livello applicativo del messaggio di richiesta.
-   Consente al client di vedere che cosa è stato ricevuto dal server: viene usato nella diagnostica e nel testing dei servizi Web.

## Status Code
>Lo status code è un numero di tre cifre, di cui la prima indica la classe della risposta e le altre due la risposta specifica.

Ci sono 5 classi:
-   **1xx: Informational**. Una risposta temporanea alla richiesta, durante il suo svolgimento (sconsigliata a partire da HTTP 1.0).
-   **2xx: Successful**. Il server ha ricevuto, capito e accettato la richiesta.
-   **3xx: Redirection**. Il server ha ricevuto e capito la richiesta, ma sono necessarie altre azioni da parte del client per portare a termine la richiesta.
-   **4xx: Client error**. La richiesta del client non può essere soddisfatta per un errore da parte del client (errore sintattico o richiesta non autorizzata).
-   **5xx: Server error**. La richiesta può anche essere corretta, ma il server non è in grado di soddisfare la richiesta per un problema interno (suo o di applicazioni CGI).

## Cookie
Parallelamente alle sequenze request/response, il protocollo prevede una struttura dati che si muove come un token, dal client al server e viceversa: i cookie.
I cookie possono essere generati sia dal client che dal server. Dopo la loro creazione vengono sempre passati ad ogni trasmissione di request e response. Hanno come scopo quello di fornire un supporto per il **mantenimento di stato** in un protocollo come HTTP che è essenzialmente *stateless*.

### Struttura dei cookie
-   **Key**: identifica univocamente un cookie all’interno di un dominio:path.
-   **Value**: valore associato al cookie (è una stringa di max 255 caratteri).
-   **Path**: posizione nell’albero di un sito al quale è associato (di default /).
-   **Domain**: dominio dove è stato generato
-   **Max-age**: (opzionale) numero di secondi di vita (permette la scadenza di una sessione , ne parleremo a breve... ).
-   **Secure**: (opzionale) non molto usato. Questi cookie vengono trasferiti se e soltanto se il protocollo è sicuro (https).
-   **Version**: identifica la versione del protocollo di gestione dei cookie.

## Autenticazione
### Riconoscimento indirizzo IP
Basare l’autenticazione sull’indirizzo IP del client è una soluzione che presenta vari svantaggi:
-   Non funziona se l’indirizzo non è pubblico (vedi esempio dei *NAT*).
-   Non funziona se l’indirizzo IP è assegnato dinamicamente (es. *DHCP*).
-   Esistono tecniche che consentono di presentarsi con un IP fasullo (*spoofing*).

L’autenticazione HTTP Digest è caduta in disuso negli ultimi anni (invio di password dopo hash). Normalmente si usano **Form** e **HTTP Basic**.

### Autenticazione HTTP Basic
Challenge (da parte del server): 
```
HTTP/1.1 401 Authorization Required
WWW - Authenticate: Basic realm=“Secure Area"
```

Response (da parte del cliente): 
```
GET /private/index.html HTTP/1.1
Host: localhost
Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ== (codificato in Base64)
```